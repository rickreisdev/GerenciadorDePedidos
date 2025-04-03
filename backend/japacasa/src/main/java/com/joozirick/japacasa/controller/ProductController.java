package com.joozirick.japacasa.controller;

import com.joozirick.japacasa.domain.product.Product;
import com.joozirick.japacasa.domain.product.ProductRequestDTO;
import com.joozirick.japacasa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    public ResponseEntity<Product> create(@RequestBody ProductRequestDTO body){
        Product newProduct = this.productService.addProduct(body);
        return ResponseEntity.ok(newProduct);
    }
}
