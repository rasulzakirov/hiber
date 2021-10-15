package peaksoft;

import org.hibernate.Session;
import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;

import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        User user = new User("raul","zakirov",10);


        UserService userService = new UserServiceImpl();

        userService.cleanUsersTable();
        Util.shutDown();
    }
}
