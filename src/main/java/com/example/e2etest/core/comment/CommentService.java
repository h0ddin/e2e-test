package com.example.e2etest.core.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    List<CommentDto> findAll() {
        return CommentMapper.toDtos(commentRepository.findAllBy());
    }
}
