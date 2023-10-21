package com.last.dioproject.service;

import com.last.dioproject.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);

}
