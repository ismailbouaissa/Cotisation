package com.example.demo.repositories;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	Optional<Contact> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Optional<Contact> findByEmail(String email);
    Optional<Contact> findbyMessage(String message);
    boolean existsByMessage(String message);
}