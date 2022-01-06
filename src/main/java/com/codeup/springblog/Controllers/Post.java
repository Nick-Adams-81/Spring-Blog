package com.codeup.springblog.Controllers;

import javax.persistence.*;

@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String body;

    @Column(nullable = false, length = 100)
    private String title;

    @ManyToOne
    private Users owner;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
