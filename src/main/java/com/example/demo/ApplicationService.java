package com.example.demo;

import com.example.demo.model.Post;
import com.example.demo.model.User;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    private final PostRepository postRepository;
    public final UserRepository userRepository;

    public ApplicationService(PostRepository postSDJRepository,
                              UserRepository userSDJRepository) {
        this.postRepository = postSDJRepository;
        this.userRepository = userSDJRepository;
    }

    public String test() {
        User user = this.userRepository.findByUserId(1L);
        Post post = this.postRepository.findByPostId(123L);
        return user.getName() + " " + post.getPostId();
    }
}
