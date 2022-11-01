package web.dao;

import web.model.User;

import java.util.List;


public interface UserDao {
    void addUser(User user);
    void deleteUser(Long id);
    void changeUser(Long id, User changedUser);
    User findById(Long id);
    List<User> getAllUsers();
}
