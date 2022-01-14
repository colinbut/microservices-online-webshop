/*
 * |-------------------------------------------------
 * | Copyright © 2022 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.service.impl;

import com.mycompany.customerservice.model.Customer;
import com.mycompany.customerservice.repository.CustomerRepository;
import com.mycompany.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Customer findCustomer(int customerId) {
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        if (customerOptional.isPresent()) {
            return customerOptional.get();
        }
        throw new NullPointerException();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int customerId) {
        customerRepository.deleteById(customerId);
    }

}
