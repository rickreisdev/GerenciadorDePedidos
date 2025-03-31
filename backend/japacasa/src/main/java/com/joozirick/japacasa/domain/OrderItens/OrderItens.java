package com.joozirick.japacasa.domain.OrderItens;

import com.joozirick.japacasa.domain.order.Order;
import com.joozirick.japacasa.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "order_itens")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItens {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Order order;

    private Integer quantity;
    private Double sub_total;
}
