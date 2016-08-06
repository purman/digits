package com.wangc.core.service;

import com.wangc.core.dto.user.User;

public interface UserService {
    
    User getById(Long id);
    
    void addUser(User user);
}
