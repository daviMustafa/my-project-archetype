package com.demo.services;


import com.demo.entity.User;

public interface UserService extends AbstractService<User, Long> {

    User findUserByName(String name);

}
