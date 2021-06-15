package ru.forum.repository.mem;

import org.springframework.stereotype.Repository;
import ru.forum.model.Comment;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

//@Repository
public class CommentRepository {
    private final Map<Integer, Comment> comments = new ConcurrentHashMap<>();
    private final AtomicInteger ids = new AtomicInteger(1);

    public void save(Comment comment) {
        comment.setId(ids.getAndIncrement());
        comments.put(comment.getId(), comment);
    }
}
