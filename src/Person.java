import java.sql.DriverManager;
import java.sql.SQLException;

public record Person(int id, String forename, String surname) {
    public void addToDB() throws SQLException {
        String qry = "INSERT INTO java (id, forename, surname) VALUES " +
                "(" + this.id + ", '" + this.forename + "', '" + this.surname + "')";
        String username = "java";
        String password = "y6luKFfixrHeeQi1r838&IN3%2fX";
        String url = "jdbc:mysql://localhost:3306/home";
        DriverManager.getConnection(url, username, password).createStatement().execute(qry);
    }
}