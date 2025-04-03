package com.joozirick.japacasa.repositories;

import com.joozirick.japacasa.domain.OrderItens.OrderItens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderItensRepository extends JpaRepository<OrderItens, UUID> {
}
