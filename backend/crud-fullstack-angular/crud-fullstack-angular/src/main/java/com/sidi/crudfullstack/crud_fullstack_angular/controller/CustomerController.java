package com.sidi.crudfullstack.crud_fullstack_angular.controller;

import com.sidi.crudfullstack.crud_fullstack_angular.Service.CustomerService;
import com.sidi.crudfullstack.crud_fullstack_angular.entity.Customer;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Hafdala Mehdi Sidi
 */
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }
@PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
         Customer customerDb = customerService.findById(customer.getId());
         customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setEmail(customer.getEmail());
        return customerService.update(customerDb);

    }
}


