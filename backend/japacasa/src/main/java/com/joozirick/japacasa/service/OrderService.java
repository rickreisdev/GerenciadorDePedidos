package com.joozirick.japacasa.service;

import com.joozirick.japacasa.domain.address.Address;
import com.joozirick.japacasa.domain.customer.Customer;
import com.joozirick.japacasa.domain.order.Order;
import com.joozirick.japacasa.domain.order.OrderRequestDTO;
import com.joozirick.japacasa.repositories.AddressRepository;
import com.joozirick.japacasa.repositories.CustomerRepository;
import com.joozirick.japacasa.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Order addOrder(UUID customerId, UUID addressId, OrderRequestDTO data){
        Customer customer= customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found"));

        Address address = addressRepository.findById(addressId)
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));

        Order newOrder = new Order();

        newOrder.setOrder_date(data.order_date());
        newOrder.setStatus(data.status());
        newOrder.setDelivery_price(data.delivery_price());
        newOrder.setPayment_method(data.payment_method());
        newOrder.setTotal(data.total());
        newOrder.setAddress(address);
        newOrder.setCustomer(customer);

        return orderRepository.save(newOrder);
    }
}
