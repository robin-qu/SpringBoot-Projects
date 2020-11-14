package com.robin.springboot06jpa.repository;

import com.robin.springboot06jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}
