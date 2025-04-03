package com.joozirick.japacasa.domain.product;

public record ProductRequestDTO(String name, String description, String category,
                                Double price, Integer stock, String image_url) {
}
