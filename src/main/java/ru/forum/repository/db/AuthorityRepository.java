package ru.forum.repository.db;

import org.springframework.data.repository.CrudRepository;
import ru.forum.model.Authority;

public interface AuthorityRepository extends CrudRepository<Authority, Integer> {
    Authority findByAuthority(String authority);
}
