package com.example.CarSharing.dao.repositories;

import com.example.CarSharing.dao.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
    List<Product> findByCity(String city);
    List<Product> findByCityAndTitle(String city, String title);
}
