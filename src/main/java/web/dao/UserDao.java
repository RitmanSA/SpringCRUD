package web.dao;

import web.model.User;

import java.util.List;


public interface UserDao {
    void addUser();
    void deleteUser();
    void changeUserFirstName();
    void changeUserLastName();
    void changeUserEmail();
    User getUserById();
    List<User> getAllUsers();
}
