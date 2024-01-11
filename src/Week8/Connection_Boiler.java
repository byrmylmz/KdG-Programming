package Week8;

import java.sql.*;

public class Connection_Boiler {
    public static void main(String[] args) {
        try {
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:hsqldb:file:db/myDatabase",
                            //"jdbc:hsqldb:mem:memoryDatabase",
                            "sa", "");

            Statement statement = connection.createStatement();

            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS players (player_name VARCHAR(10), top_score INTEGER)");

            statement.executeUpdate("DELETE FROM players");

            statement.executeUpdate("INSERT INTO players (player_name, top_score) VALUES ('Lars', 9001)");
            statement.executeUpdate("INSERT INTO players (player_name, top_score) VALUES ('Jack', 10000)");
            statement.executeUpdate("INSERT INTO players (player_name, top_score) VALUES ('Ben', 1234)");

            ResultSet resultSet = statement.executeQuery(
                    "SELECT player_name, top_score FROM players WHERE top_score > 9000 ORDER BY top_score DESC");
            while (resultSet.next()) {
                String playerName = resultSet.getString(1);
                int topScore = resultSet.getInt(2);

                System.out.printf("%-10s %5d%n", playerName, topScore);
            }
            resultSet.close();
            statement.close();
            // note: closing the connections will also close the resultset and statement
            connection.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
