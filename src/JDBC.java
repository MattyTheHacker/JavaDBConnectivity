import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        String username = "java";
        String password = "fakepassword";
        String qry = "SELECT * FROM java";
        String url = "localhost";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(qry);
            StringBuilder sb = new StringBuilder();
            while (result.next()) {
                sb.append(result.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
