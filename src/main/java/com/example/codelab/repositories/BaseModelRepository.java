package com.example.codelab.repositories;

import com.example.codelab.models.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BaseModelRepository extends JpaRepository<BaseModel, Long> {


    @Query("select bm from BaseModel bm")
    List<BaseModel> searchAll();
}
