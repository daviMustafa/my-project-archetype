package com.demo.services.impl;

import com.demo.entity.User;
import com.demo.model.UserDTO;
import com.demo.repository.UserRepository;
import com.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

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

    @Override
    public List<UserDTO> findUsers() {
        return userRepository.findUsers();
    }
}
