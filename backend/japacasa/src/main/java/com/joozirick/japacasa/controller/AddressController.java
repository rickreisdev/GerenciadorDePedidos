package com.joozirick.japacasa.controller;

import com.joozirick.japacasa.domain.address.Address;
import com.joozirick.japacasa.domain.address.AddressRequestDTO;
import com.joozirick.japacasa.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("")
    public ResponseEntity<Address> create(@PathVariable UUID CustomerId, @RequestBody AddressRequestDTO body){
        Address newAddress = this.addressService.addAddress(CustomerId, body);
        return ResponseEntity.ok(newAddress);
    }
}
