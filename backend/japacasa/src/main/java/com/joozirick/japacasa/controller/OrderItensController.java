package com.joozirick.japacasa.controller;

import com.joozirick.japacasa.domain.OrderItens.OrderItens;
import com.joozirick.japacasa.domain.OrderItens.OrderItensRequestDTO;
import com.joozirick.japacasa.domain.order.Order;
import com.joozirick.japacasa.domain.order.OrderRequestDTO;
import com.joozirick.japacasa.service.OrderItensService;
import com.joozirick.japacasa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/orderItens")
public class OrderItensController {
    @Autowired
    private OrderItensService orderItensService;

    @PostMapping("/{orderId}/{productId}")
    public ResponseEntity<OrderItens> create(
            @PathVariable UUID orderId,
            @PathVariable UUID productId,
            @RequestBody OrderItensRequestDTO body){

        OrderItens newOrderItens = this.orderItensService.addOrderItens(orderId, productId, body);
        return ResponseEntity.ok(newOrderItens);
    }

}
