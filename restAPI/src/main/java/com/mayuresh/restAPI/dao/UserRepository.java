package com.mayuresh.restAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayuresh.restAPI.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
