package com.healthcare.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.healthcare.entity.Cart;
import com.healthcare.entity.CartInput;
import com.healthcare.entity.Product;
import com.healthcare.entity.ProductInput;
import com.healthcare.repository.ProductsRepository;
import com.healthcare.service.CartService;
import com.healthcare.service.ProductsService;

/*
 * Testing done Post man all methods are Validated 
 * 
 */
@Controller
//@CrossOrigin("http://localhost:4200/")
//@RequestMapping("/product")
public class ProductsController 
{
	@Autowired
	ProductsService prodservice;
	@Autowired 
	CartService cartservice;

	@PostMapping("/AddNewProduct")
	public String addProduct(@ModelAttribute Product product)
	{
		List<Product>products=
				prodservice.getAllProducts();
		System.out.println("Reached to Body");
		//product.setId(products.size());
		prodservice.addProduct(product);
		
		
		return "index";
	}
	
	
	@PostMapping("/saveprodutcart")
	public ModelAndView addProductS(@ModelAttribute ProductInput product)
	{
		String strid[]=product.getId().split(",");
		String stname[]=product.getName().split(",");
		String strcategory[]=product.getCategory().split(",");
		String stridprice[]=product.getPrice().split(",");
		
		System.out.println("Reached to Body to read table");
		
		for (int i =0;i<strid.length;i++)
		{
			
			System.out.println("Add the ID "+strid[i]);
			System.out.println("Add the Name "+stname[i]);
			System.out.println("Add the Category "+strcategory[i]);
			System.out.println("Add the Price "+stridprice[i]);
		}
		
//		System.out.println("Reached to Body to read table");
//		System.out.println("Add the ID "+product.getId());
//		System.out.println("Add the Name "+product.getName());
//		System.out.println("Add the Category "+product.getCategory());
//		System.out.println("Add the Price "+product.getPrice());
//		System.out.println("Add the Qty "+product.getQuantity());
//		
		String quantity[]=prodservice.convertJSONtoStringCartNo(product.getQuantity());
		for (int i=0;i<quantity.length;i++)
		{
//			System.out.println(");
			System.out.println("Qunatity Is: "+quantity[i]);
			
		}
		String ids[]=prodservice.convertJSONtoStringId(product.getQuantity(),quantity.length);
		for (int i=0;i<ids.length;i++)
		{
			System.out.println("Lendth of IDS is "+ids.length);
			System.out.println("Ids are Is: "+ids[i]);
			
		}
		List<Product> allproducts=prodservice.getAllProducts();	
		ArrayList<Cart> al=new ArrayList<Cart>();
		
		for(int i=0;i<allproducts.size();i++)
		{
			System.out.println("Inside the loop ");
			Product oneproduct=allproducts.get(i);
			for (int j=0;j<ids.length;j++)
			{
				System.out.println("Line 105");
				if(Integer.parseInt(ids[j]) == oneproduct.getId() )
				{
					System.out.println("Product Found !!");
					Cart cart= new Cart();
					System.out.println("112!!");
					cart.setName(oneproduct.getName());
					System.out.println("114!!");
					cart.setPrice(oneproduct.getPrice());
					System.out.println("116 !!");
					cart.setQuantity(Integer.parseInt(quantity[j]));
					System.out.println("1118!!");
					cart.setCategory(oneproduct.getCategory());
					double price=oneproduct.getPrice()*Integer.parseInt(quantity[j]);
					System.out.println("Double Price :"+price);
					cart.setFinalprice(price);
					
					System.out.println(cart.getFinalprice());
					System.out.println(Integer.parseInt(quantity[j]));
					System.out.println("Setting the Final Price :"+cart.getFinalprice());
					System.out.println("Seeting the Quantity as Well");
					
					cart.setProductid((int)oneproduct.getId());
					
					
					al.add(cart);
					
					
				}
				System.out.println("125!!");
			}
			System.out.println("127!!");
		}
		
		cartservice.addCartBulk(al);
		System.out.println("Everything added to cart");
		
//		JsonObject jsonObject = new JsonParser().parse(product.getQuantity()).getAsJsonObject();
//		JsonElement cartObject = jsonObject.get("cart");
//		
//	String cart=request.getParameter("cart");
	
//		
//		String str=product.getQuantity();
//		String strwork[]=str.split(":");
//		String result[]= new String[strwork.length-1];
//		for(int i=1;i<strwork.length;i++)
//		{
//			result[i]=strwork[i+1];
//			
//		}
		
		
		//prodservice.addProduct(product);
		
		List<Cart> cart=cartservice.getAllProducts();
		System.out.println("Called cart Service");
//		Model model=null;
//		System.out.println("Model createdd");
//		model.addAttribute("cart",cart);
//		System.out.println("Added in Moded");
//		return "displayCart - Copy";
//		
		System.out.println("Created Model and View");
		ModelAndView mav = new ModelAndView();
		System.out.println("Created Model and View");
        mav.addObject("cart",cart);
        System.out.println("Added to Cart");
        
        mav.setViewName("DisplayCart");
      //  mav.setViewName("displayCart - Copy2");
        
        
        System.out.println("Created Model and View");

        return mav;
	}
	
	@GetMapping("/allProducts")
	public String getAllProducts(Model model)
	{
		
		List<Product> product=prodservice.getAllProducts();
		
		
		model.addAttribute("product",product);
		
		return "ProductDetails";
	}
	
	
	@GetMapping("/searchallProducts")
	public String searchAllProducts(Model model)
	{
		
		List<Product> product=prodservice.getAllProducts();
		
		
		model.addAttribute("product",product);
		
		return "SearchMedicine";
	}
	

	
//	@GetMapping("/editproduct")
//	public ModelAndView editProduct(@RequestParam  long userid)
//	{
//		Product product=prodservice.getProductById(userid);
//	
//		prodservice.updatedProduct(product, userid);
//		ModelAndView mav=new ModelAndView("EditProduct");
//		mav.addObject("product", product);
//		return mav;
//	}
	//@DeleteMapping("/movies/{id}")
	

//@GetMapping("/deleteproduct")
//
////public String deleteProductn(@RequestParam long id)
////{
////	System.out.println("Deleting the Product "+id);
////	prodservice.deleteProduct(id);
////	
////	return "index";
////	
////}



	
	@GetMapping("/get-sorted-products")
	public List<Product> sortProducts()
	{
		return prodservice.getSortedProduct();
	}
	
//	@GetMapping("product-byid/{id}")
//	public Product getProductById(@PathVariable long id)
//	{
//		return prodservice.getProductById(id);
//	}
//	
@GetMapping("/editproduct")
	
	public ModelAndView editProduct(@RequestParam long id)
	{
	Product product=prodservice.getProductById(id);
		//List<User> user=userservice.getAllUsers();
    //	List <User>users=userservice.searchUser(keyword);
	ModelAndView mav=new ModelAndView("EditProduct");
	mav.addObject("product", product);
	return mav;
		
		
	}

@PostMapping("/confirmorder")
public ModelAndView showCart(@ModelAttribute ProductInput product)
{
	
	List<Cart> cart=cartservice.getAllProducts();
	Cart newcart= new Cart();
	
	
	double finalprice=0;
	Cart testcart= new Cart();
	for (int i=0;i<cart.size();i++)
		{
		testcart=(Cart)cart.get(i);
		finalprice=finalprice+testcart.getFinalprice();
		
		}
	String value="Total Amount is : "+String.valueOf(finalprice);
	System.out.println("Final Value is "+value);
	newcart.setName(value);
	cart.add(newcart);
//	CartInput finalcartvalue=new CartInput();
//	String medicine="";
//	int medicinecount=cart.size();
//	Cart cartvalue=new Cart();
//	double finalprice=0;
//	List<CartInput> cartimput= null;
//			
//	for (int i=0;i<cart.size();i++)
//	{
//		cartvalue=(Cart)cart.get(i);
//		finalprice=finalprice+cartvalue.getFinalprice();
//		if(i!=cart.size()-1)
//		{
//			finalcartvalue.setMedicineordered(cartvalue.getName());
//			
//			
//		}
//		else
//		{
//			finalcartvalue.setMedicineordered(cartvalue.getName());
//			finalcartvalue.setMedicineordered(String.valueOf(finalcartvalue));
//			cartimput.add(finalcartvalue);
//		}
//	
//	}
	
		
	
	ModelAndView mav = new ModelAndView();
	System.out.println("Created Model and View");
    mav.addObject("cart",cart);
    mav.setViewName("CheckoutCart");
  //  mav.setViewName("displayCart - Copy2");
    
    
    System.out.println("Created Model and View");

    return mav;
}
	
@PostMapping("/saveproduct")

public String saveProduct(@ModelAttribute Product product)
{
	System.out.println("Reached Sace Product"+product.getName());
	prodservice.updatedProduct(product, product.getId());
	return "index";
	
}

//@PutMapping("/updateProduct/{userid}")
//public void updateProduct(@RequestBody Product product,@PathVariable long userid)
//{
//
//	prodservice.updatedProduct(product, userid);
//}



@GetMapping("/deleteproduct")

public String deleteProduct(@RequestParam long id)
{
	System.out.println("Deleting the Product "+id);
	prodservice.deleteProduct(id);
	
	return "index";
	
}


//@DeleteMapping("/deleteproduct/{id}")
//
////@DeleteMapping("/deleteproduct")
//public String deleteProduct(@PathVariable("id") long id)
//{
//	return prodservice.deleteProduct(id);
//}

	@GetMapping("/addproduct")
	public String addcategory() 
	{
		
		return "AddProduct";
	}

}
