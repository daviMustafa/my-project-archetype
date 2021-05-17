package com.demo.model;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = -6975162011805908635L;

    private final String name;
    private final String age;

    public UserDTO(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
