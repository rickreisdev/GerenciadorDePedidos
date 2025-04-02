package com.joozirick.japacasa.service;

import com.joozirick.japacasa.domain.address.Address;
import com.joozirick.japacasa.domain.address.AddressRequestDTO;
import com.joozirick.japacasa.domain.customer.Customer;
import com.joozirick.japacasa.repositories.AddressRepository;
import com.joozirick.japacasa.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Address addAddress(UUID customerId, AddressRequestDTO data){
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Address newAddress = new Address();

        newAddress.setStreet(data.street());
        newAddress.setNumber(data.number());
        newAddress.setNeighborhood(data.neighborhood());
        newAddress.setZip_code(data.zip_code());
        newAddress.setExtra_info(data.extra_info());

        newAddress.setCustomer(customer);
        return addressRepository.save(newAddress);
    }
}
