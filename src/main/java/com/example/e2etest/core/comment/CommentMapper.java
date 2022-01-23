package com.example.e2etest.core.comment;

import java.util.List;
import java.util.stream.Collectors;

public class CommentMapper {
    public static List<CommentDto> toDtos(List<Comment> comments) {
        return comments.stream()
                .map(CommentMapper::toDto)
                .collect(Collectors.toList());
    }

    private static CommentDto toDto(Comment comment) {
        return new CommentDto(comment.getId(), comment.getContent(), comment.getPost().getId());
    }
}
