/*
 * |-------------------------------------------------
 * | Copyright © 2022 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.controller;

import com.mycompany.customerservice.model.Customer;
import com.mycompany.customerservice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public ResponseEntity<?> getCustomers() {
        List<Customer> customers = customerService.getCustomers();

        return ResponseEntity.ok(customers);
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomer(@PathVariable int customerId) {

        log.debug("Getting customer with id: {}", customerId);

        Customer customer = customerService.findCustomer(customerId);

        log.info("Retrieved customer {} and returning", customer);

        return ResponseEntity.ok(customer);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public void saveNewCustomer(@RequestBody Customer customer) {

        log.debug("Saving new customer {}", customer);

        customerService.saveCustomer(customer);
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.DELETE)
    public void removeCustomer(int customerId) {

        log.debug("Removing customer: {}", customerId);

        customerService.deleteCustomer(customerId);
    }

}
