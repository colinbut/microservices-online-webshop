/*
 * |-------------------------------------------------
 * | Copyright © 2022 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.registrationservice.service.impl;

import com.mycompany.registrationservice.model.Customer;
import com.mycompany.registrationservice.service.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public void registerNewCustomer(Customer customer) {
        log.info("Registering a new customer: {}", customer);
    }
}
