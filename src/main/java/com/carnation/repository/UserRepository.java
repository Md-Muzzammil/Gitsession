package com.carnation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carnation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
