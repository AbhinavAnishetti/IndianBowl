package com.ava.indianbowl.resourcecontroller;


import com.ava.indianbowl.resource.Product;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("products")
public class ProductController {

    HashSet<Product> productSet = new HashSet<Product>();

    @GetMapping("/Get")
    public Set<Product> getProducts(){
        return productSet;
    }

    @PostMapping
    public long createProduct(@RequestBody Product product){
       productSet.add(product);
       return product.getProductId();
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
