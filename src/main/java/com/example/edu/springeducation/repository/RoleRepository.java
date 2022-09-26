package com.example.edu.springeducation.repository;

import com.example.edu.springeducation.model.ERole;
import com.example.edu.springeducation.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
