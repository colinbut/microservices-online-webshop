/*
 * |-------------------------------------------------
 * | Copyright © 2022 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.service;

import com.mycompany.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    Customer findCustomer(int customerId);

    void saveCustomer(Customer customer);

    void deleteCustomer(int customerId);

}
