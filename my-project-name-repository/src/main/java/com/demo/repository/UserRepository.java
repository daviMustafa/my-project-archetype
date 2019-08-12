package com.demo.repository;

import com.demo.entity.User;

public interface UserRepository extends AbstractDao<User, Long> {

    User findUserByName(String name);
}
