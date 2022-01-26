package com.example.e2etest.core;

import com.example.e2etest.core.comment.Comment;
import com.example.e2etest.core.post.Post;

import java.util.List;

public class MapperBaseTest {

    protected Post post1 = createPost(1L, "Name_1", null);
    protected Post post2 = createPost(2L, "Name_2", null);

    protected Comment comment1 = createComment(1L, "Content_1");
    protected Comment comment2 = createComment(2L, "Content_2");
    protected Comment comment3 = createComment(3L, "Content_3");
    protected Comment comment4 = createComment(4L, "Content_4");

    protected Post createPost(long id, String Name_2, List<Comment> comments2) {
        return Post.builder()
                .id(id)
                .name(Name_2)
                .comments(comments2)
                .build();
    }

    protected Comment createComment(long id, String Content_2) {
        return Comment.builder()
                .id(id)
                .content(Content_2)
                .build();
    }
}
