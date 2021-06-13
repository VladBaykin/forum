package ru.forum.service;

import org.springframework.stereotype.Service;
import ru.forum.model.Comment;
import ru.forum.model.Post;
import ru.forum.repository.mem.CommentRepository;
import ru.forum.repository.mem.PostRepository;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public CommentService(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    public void save(Comment comment) {
        commentRepository.save(comment);
        Post post = postRepository.findById(comment.getPost().getId()).get();
        post.addComment(comment);
    }
}
