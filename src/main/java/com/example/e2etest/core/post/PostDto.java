package com.example.e2etest.core.post;

import com.example.e2etest.core.comment.CommentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PostDto {
    private Long id;
    private String name;
    private List<CommentDto> comments;

}
