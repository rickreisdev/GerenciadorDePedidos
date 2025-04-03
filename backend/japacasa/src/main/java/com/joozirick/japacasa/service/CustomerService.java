package com.joozirick.japacasa.service;

import com.joozirick.japacasa.domain.customer.Customer;
import com.joozirick.japacasa.domain.customer.CustomerRequestDTO;
import com.joozirick.japacasa.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer (CustomerRequestDTO data){
        Customer newCustomer = new Customer();

        newCustomer.setName(data.name());
        newCustomer.setPhone(data.phone());
        newCustomer.setBirth_date(data.birth_date());

        return customerRepository.save(newCustomer);
    }
}
