/*
 * |-------------------------------------------------
 * | Copyright © 2022 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.customerservice.repository;

import com.mycompany.customerservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
