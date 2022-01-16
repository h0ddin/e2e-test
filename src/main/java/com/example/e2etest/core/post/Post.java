package com.example.e2etest.core.post;

import com.example.e2etest.core.comment.Comment;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "postId")
    private List<Comment> comments;
}
