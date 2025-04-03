package com.joozirick.japacasa.repositories;

import com.joozirick.japacasa.domain.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
