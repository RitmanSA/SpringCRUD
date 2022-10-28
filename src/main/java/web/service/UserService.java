package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser();
    void deleteUser();
    void changeUserFirstName();
    void changeUserLastName();
    void changeUserEmail();
    User getUserById();
    List<User> getAllUsers();
}
