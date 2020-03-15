package com.ava.indianbowl.resourcecontroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public String getProducts(){
        return "get Products was called";
    }

    @PostMapping
    public String createProduct(){
       return "create product was called";
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
