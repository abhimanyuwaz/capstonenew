package com.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.healthcare.entity.Product;
import com.healthcare.repository.ProductsRepository;

@Service
public class ProductsService 
{

	@Autowired
	private ProductsRepository prodrepo;
	
	public String addProduct(Product product) 
	{
		prodrepo.save(product);
		return "Product Added";
		
	}
	
	public List<Product> getAllProducts()
	{
		return prodrepo.findAll();
		
	}
	
	public List<Product> getSortedProduct()
	{
		return prodrepo.findAll(Sort.by("category"));
	}
	
	public String updatedProduct(Product product,long id)
	{
	Product addproduct=prodrepo.findById(id).get();
	addproduct.setCategory(product.getCategory());
	addproduct.setName(product.getName());
	addproduct.setPrice(product.getPrice());
	addproduct.setQuantity(product.getQuantity());
	addproduct.setUrl(product.getUrl());
	prodrepo.save(addproduct);
	return "Product is Updated";
		
	}
	
	public String deleteProduct(long id)
	{
		prodrepo.deleteById(id);
		return "Product is Deleted";
		
	}

	public Product getProductById(long id)
	{
		return prodrepo.findById(id).get();
		
	}
	
	public String[] convertJSONtoStringCartNo(String str)
	{
		 System.out.println(str);
        String str1[] =str.split(":");
        for(int i=0;i<str1.length;i++)
        {
         System.out.println(str1[i]);   
        }
        String res[]= new String[str1.length-2];
        
        for(int j=2;j<str1.length;j++)
        {
            
            if(j==str1.length-1)
            {
                String lastres[]=str1[j].split("}");
                res[j-2]=lastres[0];
                
            }
            else
            {
                String result[]= new String[str1[j].split(",").length];
                result=str1[j].split(",");
                res[j-2]=result[0]; 
            }
//            System.out.println("Quantity is");
//            System.out.println(res[j-2]);
			
		}
        return res;
	}
	public String[] convertJSONtoStringId(String str, int len)
	{
		String str1[] =str.split("\"");
		String result[] = new String[len];
		int k=0;
		
	      for(int i=1;i<str1.length;i++) 
	      {
	          
	          if(str1[i].length()==1)
	          {
	              //System.out.println(str1[i]);
	              result[k]=str1[i];
	              k++;
	          }
	          
	      }
	      return result;
	}
			
	  
		
	}
	

