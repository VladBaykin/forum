package ru.forum.service;

import org.springframework.stereotype.Service;
import ru.forum.model.Authority;
import ru.forum.repository.db.AuthorityRepository;

@Service
public class AuthorityService {
    private final AuthorityRepository authorityRepository;

    public AuthorityService(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    public Authority findByAuthority(String authority) {
        return authorityRepository.findByAuthority(authority);
    }
}
