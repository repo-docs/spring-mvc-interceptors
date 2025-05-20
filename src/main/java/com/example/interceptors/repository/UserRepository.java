package com.example.interceptors.repository;

import com.example.interceptors.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Optional, but good practice

import java.util.Optional;

@Repository // Indicates that this is a Spring Data repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository<EntityType, IdType>

    // Spring Data JPA will automatically create implementations for basic CRUD operations:
    // - save()
    // - findById()
    // - findAll()
    // - deleteById()
    // - ...and more

    // You can also define custom query methods here if needed, e.g.:
    Optional<User> findByEmail(String email);
}