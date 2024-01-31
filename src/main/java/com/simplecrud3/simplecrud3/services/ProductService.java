package com.simplecrud3.simplecrud3.services;

import com.simplecrud3.simplecrud3.models.entity.Product;
import com.simplecrud3.simplecrud3.models.repos.ProductRepos;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepos productRepos;

    public Product saveProduct(Product product){
        return productRepos.save(product);
    }

    public Product findOneProduct(Long id){
        return productRepos.findById(id).orElse(null);
    }

    public Iterable<Product> findAllProduct(){
        return productRepos.findAll();
    }

    public String removeProduct(Long id){
        productRepos.deleteById(id);
        return "Data berhasil di hapus !!!";
    }

    public List<Product> findByName(String name) {
        return productRepos.findByNameContain(name);
    }
}
