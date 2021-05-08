package com.edersousa.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edersousa.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
