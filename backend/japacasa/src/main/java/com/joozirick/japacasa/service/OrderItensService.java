package com.joozirick.japacasa.service;

import com.joozirick.japacasa.domain.OrderItens.OrderItens;
import com.joozirick.japacasa.domain.OrderItens.OrderItensRequestDTO;
import com.joozirick.japacasa.domain.address.Address;
import com.joozirick.japacasa.domain.customer.Customer;
import com.joozirick.japacasa.domain.order.Order;
import com.joozirick.japacasa.domain.product.Product;
import com.joozirick.japacasa.repositories.OrderItensRepository;
import com.joozirick.japacasa.repositories.OrderRepository;
import com.joozirick.japacasa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderItensService {
    @Autowired
    private OrderItensRepository orderItensRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public OrderItens addOrderItens(UUID orderId, UUID productId, OrderItensRequestDTO data){
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Order not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));

        OrderItens newOrderItens = new OrderItens();

        newOrderItens.setOrder(order);
        newOrderItens.setProduct(product);
        newOrderItens.setQuantity(data.quantity());
        newOrderItens.setSub_total(data.sub_total());

        return orderItensRepository.save(newOrderItens);
    }
}
