package com.api.dimdim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.dimdim.models.PfUser;

public interface PfUserRepository extends JpaRepository <PfUser, Long> {
    @Query(value = "SELECT * FROM pf_user", nativeQuery = true)
    List<PfUser> findAllInSchema();
}
