package com.api.dimdim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.dimdim.models.User;

public interface PfUserRepository extends JpaRepository <User, Long> {
    @Query(value = "SELECT * FROM pf_user", nativeQuery = true)
    List<User> findAllInSchema();
}
