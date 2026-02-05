package com.joaoguilhermmy.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1l;

    private String id;
    private Date date;
    private String text;
    private AuthorDTO author;

    public CommentDTO() {
    }

    public CommentDTO(String id, String text, Date date, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date date() {
        return date;
    }

    public void setMoment(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

}
