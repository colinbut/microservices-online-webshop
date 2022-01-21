/*
 * |-------------------------------------------------
 * | Copyright © 2022 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.registrationservice.service;

import com.mycompany.registrationservice.model.Customer;

public interface RegistrationService {
    void registerNewCustomer(Customer customer);
}
