package ru.forum.repository.db;

import org.springframework.data.repository.CrudRepository;
import ru.forum.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
