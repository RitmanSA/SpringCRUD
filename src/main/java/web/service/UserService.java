package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    void changeUser(Long id, User newUser);
    User getById(Long id);
    List<User> getAllUsers();
}
