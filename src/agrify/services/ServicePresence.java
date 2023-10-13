package agrify.services;

import agrify.entities.Presence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServicePresence {
    private Connection connection;

    public ServicePresence(Connection connection) {
        this.connection = connection;
    }

    public boolean savePresence(Presence presence) {
        String insertQuery = "INSERT INTO presence (user_id, date, presence_state) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, presence.getUser_id());
            preparedStatement.setDate(2, new java.sql.Date(presence.getDate().getTime()));
            preparedStatement.setString(3, presence.getPresenceState());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            System.out.println("Error occurred while saving presence record: " + ex.getMessage());
            return false;
        }
    }
}
