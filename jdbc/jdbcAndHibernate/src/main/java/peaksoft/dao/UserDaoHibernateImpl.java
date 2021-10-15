package peaksoft.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {

    }

    @Override
    public void createUsersTable() {

        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.createSQLQuery("CREATE TABLE if NOT EXISTS users(" +
                    "id serial PRIMARY KEY, " +
                    "name VARCHAR (225) NOT NULL, " +
                            "lastName VARCHAR(255) NOT NULL,"+
                    "age INT NOT NULL);").executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Create table");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void dropUsersTable() {
        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            session.createSQLQuery("DROP TABLE users").executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Drop table ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void saveUser(String name, String lastName, int age) {
        try {
            Session session = Util.getSessionFactory().openSession();
            session.beginTransaction();
            User user = new User(name, lastName, age);
            session.save(user);
            session.getTransaction().commit();
            session.close();
            System.out.println(name + " " + "add to dataBase");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void removeUserById(long id) {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        User user = (User) session.get(User.class,id);
        session.delete(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("removed user");
    }

    @Override
    public   List<User> getAllUsers() {
return  null;
    }

    

    @Override
    public void cleanUsersTable() {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Employee");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted all datas in Employee");
    }
}
