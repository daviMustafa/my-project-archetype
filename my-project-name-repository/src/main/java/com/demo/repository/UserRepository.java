package com.demo.repository;

import com.demo.entity.User;
import com.demo.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByName(String name);

    @Query("SELECT NEW com.demo.model.UserDTO(u.name, u.age) FROM User u")
    List<UserDTO> findUsers();
}
