package com.example.crud.Dao;

// Dao Object

import com.example.crud.Entitiy.Detail;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PosterMapper implements RowMapper<List<Detail>> {
    public List<Detail> mapRow(ResultSet rs, int rouNum)
    throws SQLException{
        List<Detail> list = new ArrayList<>();
        Detail tmp_post = new Detail();
        tmp_post.setId(rs.getInt("id"));
        tmp_post.setContent(rs.getString("content"));
        list.add(tmp_post);
        while(rs.next()) {
            Detail poster = new Detail();
            poster.setId(rs.getInt("id"));
            poster.setContent(rs.getString("content"));
            list.add(poster);
        }
        return list;
    }

}
