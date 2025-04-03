package com.joozirick.japacasa.controller;

import com.joozirick.japacasa.domain.customer.Customer;
import com.joozirick.japacasa.domain.customer.CustomerRequestDTO;
import com.joozirick.japacasa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("")
    public ResponseEntity<Customer> create(@RequestBody CustomerRequestDTO body){
        Customer newCustomer = this.customerService.addCustomer(body);
        return ResponseEntity.ok(newCustomer);
    }
}
