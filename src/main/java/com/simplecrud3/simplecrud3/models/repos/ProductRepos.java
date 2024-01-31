package com.simplecrud3.simplecrud3.models.repos;

import com.simplecrud3.simplecrud3.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepos extends CrudRepository<Product, Long> {

    default List<Product> findByNameContain(String name){
        return null;
    }
}
