package com.asseco.pst.services.impl;

import com.asseco.pst.entity.User;
import com.asseco.pst.repository.UserRepository;
import com.asseco.pst.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service("userService")
@Transactional
public class UserServiceImpl extends AbstractServiceImpl<User, Long> implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init(){
        this.setDaoImpl(userRepository);
    }

    @Override
    public User findUserByName(final String name) {
        return userRepository.findUserByName(name);
    }
}
