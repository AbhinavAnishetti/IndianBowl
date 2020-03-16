package com.ava.indianbowl.serviceImpl;

import com.ava.indianbowl.ProductRepository;
import com.ava.indianbowl.dto.ProductDto;
import com.ava.indianbowl.entity.ProductEntity;
import com.ava.indianbowl.ressourceResponse.ProductRest;
import com.ava.indianbowl.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductDto createProduct(ProductDto product) {

        ProductEntity productEntity = new ProductEntity();
        BeanUtils.copyProperties(product, productEntity);

        ProductEntity storedProductEntity = productRepository.save(productEntity);

        ProductDto returnValue = new ProductDto();
        BeanUtils.copyProperties(storedProductEntity, returnValue);

        return returnValue;
    }
}
