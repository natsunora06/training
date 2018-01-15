package com.example.crud.Entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Entity Class

@Entity
@Table(name = "post_test")
public class Detail {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private String created_at;
    // 日時のデータ型はStringでも大丈夫なのか？

    @Column(name = "updated_at")
    private String updated_at;



    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }

    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }

    public String getUpdated_at(){
        return updated_at;
    }
    public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }
}
