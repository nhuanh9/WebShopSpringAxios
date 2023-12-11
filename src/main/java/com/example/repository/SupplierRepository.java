package com.example.repository;


import com.example.model.Oder;
import com.example.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {


}
