package com.asseco.pst.services;


import com.asseco.pst.entity.User;

public interface UserService extends AbstractService<User, Long> {

    User findUserByName(String name);

}
