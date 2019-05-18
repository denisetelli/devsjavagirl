package com.denisetelli.api.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denisetelli.api.rest.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
