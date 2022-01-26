package com.example.e2etest.core.comment;

import com.example.e2etest.core.MapperBaseTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommentMapperTest extends MapperBaseTest {

    @Test
    public void shouldMapCommentsToCommentDtos() {
        //given
        List<Comment> comments = new ArrayList<>();

        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);

        comment1.setPost(post1);
        comment2.setPost(post1);
        comment3.setPost(post2);

        //when
        List<CommentDto> result = CommentMapper.toDtos(comments);

        //then
        assertNotNull(result);
        assertEquals(result.size(), 3);
        assertEquals(result.get(0).getId(), comment1.getId());
        assertEquals(result.get(0).getContent(), comment1.getContent());
        assertEquals(result.get(0).getPostId(), comment1.getPost().getId());

        assertEquals(result.get(1).getId(), comment2.getId());
        assertEquals(result.get(1).getContent(), comment2.getContent());
        assertEquals(result.get(1).getPostId(), comment2.getPost().getId());

        assertEquals(result.get(2).getId(), comment3.getId());
        assertEquals(result.get(2).getContent(), comment3.getContent());
        assertEquals(result.get(2).getPostId(), comment3.getPost().getId());
    }

    @Test
    public void shouldReturnEmptyList() {
        //when
        List<CommentDto> result = CommentMapper.toDtos(Collections.emptyList());

        //then
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}