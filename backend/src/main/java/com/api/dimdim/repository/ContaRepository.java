package com.api.dimdim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.dimdim.models.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    

}
