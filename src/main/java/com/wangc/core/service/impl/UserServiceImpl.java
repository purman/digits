package com.wangc.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wangc.core.dao.user.UserMapper;
import com.wangc.core.dto.user.User;
import com.wangc.core.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;

    @Override 
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void addUser(User user) {
		userMapper.insert(user);
		
		throw new RuntimeException();
		
	}

}
