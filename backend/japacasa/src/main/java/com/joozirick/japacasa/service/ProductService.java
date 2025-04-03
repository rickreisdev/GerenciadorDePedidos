package com.joozirick.japacasa.service;

import com.joozirick.japacasa.domain.product.Product;
import com.joozirick.japacasa.domain.product.ProductRequestDTO;
import com.joozirick.japacasa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(ProductRequestDTO data){
        Product newProduct = new Product();

        newProduct.setCategory(data.category());
        newProduct.setName(data.name());
        newProduct.setPrice(data.price());
        newProduct.setStock(data.stock());
        newProduct.setDescription(data.description());
        newProduct.setImage_url(data.image_url());

        return productRepository.save(newProduct);
    }
}
