package com.example.e2etest.core.comment;

import com.example.e2etest.core.post.Post;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID_FK")
    private Post post;
}
