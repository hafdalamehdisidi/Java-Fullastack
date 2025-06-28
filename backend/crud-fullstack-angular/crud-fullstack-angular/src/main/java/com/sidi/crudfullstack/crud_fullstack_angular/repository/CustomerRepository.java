package com.sidi.crudfullstack.crud_fullstack_angular.repository;

import com.sidi.crudfullstack.crud_fullstack_angular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hafdala Mehdi Sidi
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
