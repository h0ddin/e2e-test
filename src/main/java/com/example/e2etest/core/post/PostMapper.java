package com.example.e2etest.core.post;

import com.example.e2etest.core.comment.CommentMapper;

import java.util.List;
import java.util.stream.Collectors;

public class PostMapper {

    public static List<PostDto> toDtos(List<Post> posts) {
        return posts.stream()
                .map(PostMapper::toDto)
                .collect(Collectors.toList());
    }

    private static PostDto toDto(Post post) {
        return new PostDto(post.getId(), post.getName(), CommentMapper.toDtos(post.getComments()));
    }
}
