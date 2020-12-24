package com.rubanelearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubanelearning.entity.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {

}