package com.example.crud.Service;

import com.example.crud.Dao.PostRepository;
import com.example.crud.Entitiy.Detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service Class
@Service
public class PostService {

    @Autowired
    PostRepository repository;

    public List<Detail> search(int id, String content, String created_at, String updated_at){
        List<Detail> result = repository.findAll();
        return result;

    }



}
