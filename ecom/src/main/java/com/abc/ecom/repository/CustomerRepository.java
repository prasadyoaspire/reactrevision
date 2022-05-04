package com.abc.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.ecom.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	@Query("Select c from Customer c where c.username = :uname and c.password = :upwd")
	public Customer doCustomerLogin(@Param("uname") String username, @Param("upwd") String password);

}
