/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.command.impl;

import com.mycompany.customerservice.command.CustomerCommand;
import com.mycompany.customerservice.model.Address;
import com.mycompany.customerservice.model.Email;
import com.mycompany.customerservice.model.Money;


public final class CreateCustomerCommand implements CustomerCommand {

    private final String name;
    private final Address address;
    private final Email email;
    private final Money creditLimit;

    public CreateCustomerCommand(String name, Address address, Email email, Money creditLimit) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }
}
