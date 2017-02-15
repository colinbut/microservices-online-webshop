/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.command.impl;

import com.mycompany.customerservice.command.CustomerCommand;

import java.math.BigDecimal;

public final class UpdateCustomerCommand implements CustomerCommand {

    private final String name;
    private final BigDecimal creditLimit;

    public UpdateCustomerCommand(String name, BigDecimal creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
}
