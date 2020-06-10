package com.marcosdev.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosdev.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
