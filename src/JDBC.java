import java.sql.*;
import java.util.LinkedList;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        String username = "java";
        String password = "y6luKFfixrHeeQi1r838&IN3%2fX";
        String qry = "SELECT * FROM java";
        String url = "jdbc:mysql://localhost:3306/home";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(qry);
            LinkedList<Person> people = new LinkedList<>();
            while (rs.next()) {
                people.add(new Person(rs.getInt(1),rs.getString(2),rs.getString(3)));
            }
            people.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
