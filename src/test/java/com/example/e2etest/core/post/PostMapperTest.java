package com.example.e2etest.core.post;

import com.example.e2etest.core.MapperBaseTest;
import com.example.e2etest.core.comment.Comment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostMapperTest extends MapperBaseTest {

    @Test
    public void shouldMapPostsToPostDtos() {
        //given
        List<Comment> comments = new ArrayList<>();
        List<Comment> comments2 = new ArrayList<>();
        List<Post> posts = new ArrayList<>();

        comments.add(comment1);
        comments.add(comment2);
        comments2.add(comment3);
        comments2.add(comment4);

        posts.add(post1);
        posts.add(post2);

        comment1.setPost(post1);
        comment2.setPost(post1);
        comment3.setPost(post2);
        comment4.setPost(post2);

        post1.setComments(comments);
        post2.setComments(comments2);

        //when
        List<PostDto> result = PostMapper.toDtos(posts);

        //then
        assertNotNull(result);
        assertEquals(result.size(), 2);
        assertEquals(result.get(0).getId(), post1.getId());
        assertEquals(result.get(0).getName(), post1.getName());
        assertEquals(result.get(1).getId(), post2.getId());
        assertEquals(result.get(1).getName(), post2.getName());
    }

    @Test
    public void shouldReturnEmptyList() {
        //when
        List<PostDto> result = PostMapper.toDtos(Collections.emptyList());

        //then
        assertNotNull(result);
        assertEquals(0, result.size());
    }

}