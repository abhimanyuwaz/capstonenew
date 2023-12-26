package com.healthcare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.entity.Admin;
import com.healthcare.entity.Cart;

//
///**
// * @author 
// *
// */
//
@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
//	List<Cart> findAllByUserId(Long id);
}
