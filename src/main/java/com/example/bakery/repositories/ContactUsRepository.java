package com.example.bakery.repositories;

import com.example.bakery.models.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, String> {
    // You can add custom query methods here if needed
}