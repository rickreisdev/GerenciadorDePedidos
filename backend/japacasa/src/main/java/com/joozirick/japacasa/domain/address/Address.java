package com.joozirick.japacasa.domain.address;

import com.joozirick.japacasa.domain.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String street;
    private String number;
    private String neighborhood;
    private String extra_info;
    private String zip_code;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
