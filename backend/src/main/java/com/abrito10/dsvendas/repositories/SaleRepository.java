package com.abrito10.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrito10.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{

}
