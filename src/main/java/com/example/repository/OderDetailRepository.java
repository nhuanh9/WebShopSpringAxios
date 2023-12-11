package com.example.repository;



import com.example.model.OderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OderDetailRepository extends JpaRepository<OderDetail, Long> {

    Iterable<OderDetail> findAllByOderId(Long id);

}
