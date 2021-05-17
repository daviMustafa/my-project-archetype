package com.demo.services;


import com.demo.entity.User;
import com.demo.model.UserDTO;

import java.util.List;

public interface UserService extends AbstractService<User, Long> {

    User findUserByName(String name);

    List<UserDTO> findUsers();

}
