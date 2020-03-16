package com.ava.indianbowl.resourcecontroller;


import com.ava.indianbowl.dto.ProductDto;
import com.ava.indianbowl.resource.Product;
import com.ava.indianbowl.ressourceResponse.ProductRest;
import com.ava.indianbowl.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    HashSet<Product> productSet = new HashSet<Product>();

    @GetMapping("/Get")
    public Set<Product> getProducts(){
        return productSet;
    }

    @PostMapping
    public ProductRest createProduct(@RequestBody Product product){

       ProductRest returnProduct = new ProductRest();

        ProductDto productDto= new ProductDto();
        BeanUtils.copyProperties(product, productDto);

        ProductDto createdProduct = productService.createProduct(productDto);
        BeanUtils.copyProperties(createdProduct, returnProduct);

        return returnProduct;
    }

    @PutMapping
    public String updateProduct(){
        return "update product was called";
    }

    @DeleteMapping
    public String deleteProduct(){
        return "delete product was called";
    }
}
