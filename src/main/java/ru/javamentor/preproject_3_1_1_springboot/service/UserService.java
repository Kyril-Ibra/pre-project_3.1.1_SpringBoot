package ru.javamentor.preproject_3_1_1_springboot.service;



import ru.javamentor.preproject_3_1_1_springboot.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUserById(int id);
    List<User> getAllUsers();
}
