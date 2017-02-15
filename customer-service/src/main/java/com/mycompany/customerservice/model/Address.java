/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Address {

    private String firstLineAddress;
    private String secondLineAddress;
    private String city;
    private String town;
    private String county;
    private String postCode;
    private String country;

}
