package com.simplecrud3.simplecrud3.controllers;

import com.simplecrud3.simplecrud3.models.entity.Product;
import com.simplecrud3.simplecrud3.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

//    @ExceptionHandler
    @PostMapping
    public Product create(@Valid @RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping
    public Iterable<Product> findAllProduct(){
        return productService.findAllProduct();
    }

    @GetMapping("/{id}")
    public Product findOneProduct(@PathVariable Long id) {
        return productService.findOneProduct(id);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public String removeProduct(@PathVariable Long id) {
        return productService.removeProduct(id);
    }
}
