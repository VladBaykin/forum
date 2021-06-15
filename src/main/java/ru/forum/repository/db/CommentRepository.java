package ru.forum.repository.db;

import org.springframework.data.repository.CrudRepository;
import ru.forum.model.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
