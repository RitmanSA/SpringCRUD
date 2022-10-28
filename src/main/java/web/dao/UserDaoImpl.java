package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void changeUserFirstName() {

    }

    @Override
    public void changeUserLastName() {

    }

    @Override
    public void changeUserEmail() {

    }

    @Override
    public User getUserById() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
