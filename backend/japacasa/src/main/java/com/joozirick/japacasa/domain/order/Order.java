package com.joozirick.japacasa.domain.order;

import com.joozirick.japacasa.domain.address.Address;
import com.joozirick.japacasa.domain.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import java.util.UUID;

@Entity
@Table(name = "orders")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private UUID id;

    @OneToMany
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String order_date;
    private Double total;
    private Double delivery_price;
    private String status;
    private String payment_method;
}
