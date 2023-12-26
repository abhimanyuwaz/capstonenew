package com.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.entity.Admin;
import com.healthcare.entity.Cart;
import com.healthcare.entity.User;


/**
 * @author 
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
