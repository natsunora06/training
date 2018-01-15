package com.example.crud.Dao;

import com.example.crud.Entitiy.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Detail, String> {
    public List<Detail> findById(int id);
}
