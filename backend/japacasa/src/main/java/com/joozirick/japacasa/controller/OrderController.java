package com.joozirick.japacasa.controller;

import com.joozirick.japacasa.domain.order.Order;
import com.joozirick.japacasa.domain.order.OrderRequestDTO;
import com.joozirick.japacasa.service.AddressService;
import com.joozirick.japacasa.service.CustomerService;
import com.joozirick.japacasa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/{customerId}/{addressId}")
    public ResponseEntity<Order> create(
            @PathVariable UUID customerId,
            @PathVariable UUID addressId,
            @RequestBody OrderRequestDTO body){

        Order newOrder = this.orderService.addOrder(customerId, addressId, body);
        return ResponseEntity.ok(newOrder);
    }

}
