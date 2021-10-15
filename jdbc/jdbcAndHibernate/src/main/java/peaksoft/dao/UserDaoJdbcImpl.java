//package peaksoft.dao;
//
//import peaksoft.model.User;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//
//public class UserDaoJdbcImpl implements UserDao {
//
//    public UserDaoJdbcImpl() {
//
//    }
//
//    public void createUsersTable() {    Connection c = null;
//
//        Statement stmt = null;
//
//        String createTableSQL = "CREATE TABLE users " +
//                "(id INT PRIMARY KEY ," +
//                " name TEXT, " +
//                " lastName VARCHAR(50), " +
//                " age VARCHAR(50) ) ";
//
//        try {
//
//
//
//            c = DriverManager.getConnection(
//
//                    "jdbc:postgresql://localhost:5432/postgres",
//
//                    "postgres", "Hihi222_");
//
//            System.out.println("Database Connected ..");
//
//            stmt = c.createStatement();
//
//
//
//            stmt.executeUpdate(createTableSQL);
//
//            stmt.close();
//
//            c.close();
//
//        }
//
//        catch (SQLException e)
//
//        {
//
//            System.out.println(e.getMessage());
//
//        }
//
//        System.out.println("Table Created successfully");
//
//    }
//
//
//
//    public void dropUsersTable() {
//        Connection c = null;
//        Statement statement = null;
//        String dropTable = "DROP TABLE users";
//        try {
//            c = DriverManager.getConnection(
//
//                    "jdbc:postgresql://localhost:5432/postgres",
//
//                    "postgres", "Hihi222_");
//
//            System.out.println("Database Connected ..");
//
//            statement = c.createStatement();
//
//
//
//            statement.executeUpdate(dropTable);
//
//            statement.close();
//
//            c.close();
//            System.out.println("dropped successfully");
//        } catch ( SQLException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//    public void saveUser(String name, String lastName, int age) {
//        Connection c = null;
//        Statement statement = null;
//        String saveUser = "Insert into users(id,name ,lastName,age)"+"values (1,'raul','zakirov',10)";
//        try {
//            c = DriverManager.getConnection(
//
//                    "jdbc:postgresql://localhost:5432/postgres",
//
//                    "postgres", "Hihi222_");
//
//            System.out.println("Database Connected ..");
//
//            statement = c.createStatement();
//
//
//
//            statement.executeUpdate(saveUser);
//
//            statement.close();
//
//            c.close();
//            System.out.println("saved successfully");
//        } catch ( SQLException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//    public void removeUserById(long id) {
//        Connection c = null;
//        Statement statement = null;
//        String removeUser = "DELETE FROM users\n" +
//                "WHERE id=1;";
//        try {
//            c = DriverManager.getConnection(
//
//                    "jdbc:postgresql://localhost:5432/postgres",
//
//                    "postgres", "Hihi222_");
//
//            System.out.println("Database Connected ..");
//
//            statement = c.createStatement();
//
//
//
//            statement.executeUpdate(removeUser);
//
//            statement.close();
//
//            c.close();
//            System.out.println("remove successfully");
//        } catch ( SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public List<User> getAllUsers() {
//        return null;
//    }
//    public void cleanUsersTable() {
//        Connection c = null;
//        Statement statement = null;
//        String deleteUser = "
//        ";
//
//        try {
//            c = DriverManager.getConnection(
//
//                    "jdbc:postgresql://localhost:5432/postgres",
//
//                    "postgres", "Hihi222_");
//
//            System.out.println("Database Connected ..");
//
//            statement = c.createStatement();
//
//
//
//            statement.executeUpdate(deleteUser);
//
//            statement.close();
//
//            c.close();
//            System.out.println("deleted successfully");
//        } catch ( SQLException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//}