/*
 * |-------------------------------------------------
 * | Copyright © 2022 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {

    private int id;
    private String name;
    private String address;
    private String email;

}
