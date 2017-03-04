/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.registrationservice.controller;

import com.mycompany.registrationservice.service.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

}
