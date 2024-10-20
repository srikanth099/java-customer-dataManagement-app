package org.jsp.sk.CustomerDataManagement.Repository;

import java.util.List;

import org.jsp.sk.CustomerDataManagement.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByName(String name);

	// is used to pass query
	@Query("SELECT c FROM Customer c WHERE c.name=:name AND c.email=:email")
	List<Customer> validateCustomer(@Param("name") String name, @Param("email") String email);
}
//jpa repository requires entity class name & (@Id) primary key non primitive data type value
// jpa interface have abstart methods SAVE,DELETE,FIND.so its already
// implemented.we dont need to write code.
// java persistance api repository

//findBy___namethis name will be matching property name in entiry class
