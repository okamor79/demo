package ua.logos.service;

import ua.logos.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User findByID(int id);

    List<User> findAllUsers();

    void verifyUser(String token, String id);

    void updateUser(User user);

}
