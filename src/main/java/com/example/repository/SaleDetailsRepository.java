package com.example.repository;


import com.example.model.Oder;
import com.example.model.SaleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SaleDetailsRepository extends JpaRepository<SaleDetails, Long> {


}
