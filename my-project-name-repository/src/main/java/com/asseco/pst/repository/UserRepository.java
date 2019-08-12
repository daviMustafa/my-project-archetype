package com.asseco.pst.repository;

import com.asseco.pst.entity.User;

public interface UserRepository extends AbstractDao<User, Long> {

    User findUserByName(String name);
}
