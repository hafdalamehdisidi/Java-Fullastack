package com.sidi.crudfullstack.crud_fullstack_angular.Service;

import com.sidi.crudfullstack.crud_fullstack_angular.entity.Customer;
import com.sidi.crudfullstack.crud_fullstack_angular.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hafdala Mehdi Sidi
 */
@Service
public class CustomerServiceImplements implements CustomerService {
    private final CustomerRepository customerRepository;

// Constructor
    public CustomerServiceImplements(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).get();

    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);

    }

    @Override
    public Customer update(Customer customer) {
       return customerRepository.save(customer);
    }
}
