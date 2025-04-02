package com.joozirick.japacasa.domain.order;

public record OrderRequestDTO(String order_date, Double total, Double delivery_price,
                              String status, String payment_method) {
}
