package com.sidi.crudfullstack.crud_fullstack_angular.Service;

import com.sidi.crudfullstack.crud_fullstack_angular.entity.Customer;

import java.util.List;

/**
 * @author Hafdala Mehdi Sidi
 */
public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(Integer id);
    void deleteById(Integer id);
    Customer update(Customer customer);
}
