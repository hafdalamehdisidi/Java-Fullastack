package com.sidi.crudfullstack.crud_fullstack_angular.controller;

import com.sidi.crudfullstack.crud_fullstack_angular.Service.CustomerService;
import com.sidi.crudfullstack.crud_fullstack_angular.Service.CustomerServiceImplements;
import com.sidi.crudfullstack.crud_fullstack_angular.entity.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hafdala Mehdi Sidi
 */
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
}
