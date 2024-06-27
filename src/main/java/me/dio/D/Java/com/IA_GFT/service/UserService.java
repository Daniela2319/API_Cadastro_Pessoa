package me.dio.D.Java.com.IA_GFT.service;

import me.dio.D.Java.com.IA_GFT.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
