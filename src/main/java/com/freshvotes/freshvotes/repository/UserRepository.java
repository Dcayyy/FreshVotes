package com.freshvotes.freshvotes.repository;

import com.freshvotes.freshvotes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

  User findByUsername(String username);

}
