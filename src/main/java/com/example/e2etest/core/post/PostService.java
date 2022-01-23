package com.example.e2etest.core.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    List<PostDto> findAll() {
        return PostMapper.toDtos(postRepository.findAllBy());
    }

}
