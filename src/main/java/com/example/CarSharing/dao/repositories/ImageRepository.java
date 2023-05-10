package com.example.CarSharing.dao.repositories;

import com.example.CarSharing.dao.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
