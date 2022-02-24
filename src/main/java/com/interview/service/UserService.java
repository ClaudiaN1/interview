package com.interview.service;

import com.interview.entity.UserDTO;
import com.interview.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO user);

    UserEntity saveUser(UserEntity user);

    UserEntity getUser(String name);

    List<UserEntity> getUsers();
}
