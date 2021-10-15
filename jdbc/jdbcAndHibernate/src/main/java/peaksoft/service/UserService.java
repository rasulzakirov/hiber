package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.model.User;

import java.util.List;

public interface UserService {

    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, int age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}

