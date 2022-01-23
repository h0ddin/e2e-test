package com.example.e2etest.core.post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public List<PostDto> findAll() {
        List<PostDto> posts = postService.findAll();
        for (PostDto post : posts) {
            System.out.println(post.getName() + " com: " + post.getComments());
        }
        return posts;
    }

}
