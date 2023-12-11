package com.example.repository;


import com.example.model.Oder;
import com.example.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {


}
