package util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/** This class works with the appointments table in the database. */

public class UpdateAppointmentUtil {

    public static ObservableList<UpdateAppointmentModel> allAppointments = FXCollections.observableArrayList();


/** This method takes updated appointment information from the GUI and puts it into the appointments table in the database.
 @param appointmentID updates the appointments table where the appointment_ID matches
 @param title input from title
 @param description input from description
 @param location input from location
 @param type input from type
 @param start input from start
 @param end  input from end
 @param customerID input from customer_Id
 @param userID  input from user_Id
 @param contactID  input from Contact_ID */
    public static void updateAppointmentsTable(int appointmentID, String title, String description, String location, String type,
                                               Timestamp start, Timestamp end, Timestamp lastUpdate, String lastUpdatedBy,
                                               int customerID, int userID, int contactID) throws SQLException {
        allAppointments.clear();
        String sql = "UPDATE  appointments " +
                "SET Title = ?, Description = ?, Location = ?, Type = ?, Start = ?, End = ?, Last_Update = ?, Last_Updated_By = ?, Customer_ID = ?, User_ID = ?, Contact_ID = ? " +
                "WHERE Appointment_ID = ? ";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

        try {
            ps.setString(1, title);
            ps.setString(2, description);
            ps.setString(3, location);
            ps.setString(4, type);
            ps.setTimestamp(5, start);
            ps.setTimestamp(6, end);
            ps.setTimestamp(7, lastUpdate);
            ps.setString(8, lastUpdatedBy);
            ps.setInt(9, customerID);
            ps.setInt(10, userID);
            ps.setInt(11, contactID);
            ps.setInt(12, appointmentID);

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }



/** This method deletes appointments that match the given appointmentID
 @param appointmentID deletes the appointment where the appointmentID matches */
    public static void deleteAppointment(int appointmentID) throws SQLException {

        String sql = "DELETE FROM appointments WHERE Appointment_ID = ?";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
        ps.setInt(1, appointmentID);
        ps.executeUpdate();
    }
}




