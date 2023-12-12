package com.example.repository;


import com.example.model.Category;
import com.example.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {


}
