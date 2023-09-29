package util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.ContactsModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/** Class that gets contacts data from the contacts table in the database. */
public class ContactsUtil {
    public static ObservableList<ContactsModel> allContacts = FXCollections.observableArrayList();
    public static ObservableList<ContactsModel> contactNameByID = FXCollections.observableArrayList();


    /**
     * Method that SELECTS ALL  from contacts table. It adds Contact_ID and Contact_Name to an ObservableList.
     *
     * @return allContacts ObservableList which contains Contact_ID and Contact_Name.
     */
    public static ObservableList<ContactsModel> getAllContacts() throws SQLException {
        allContacts.clear();
        String sql = "SELECT * FROM contacts";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        while (rs.next()) {
            int contactID = rs.getInt("Contact_ID");
            String contactName = rs.getString("Contact_Name");
            ContactsModel c = new ContactsModel(contactID, contactName);
            allContacts.add(c);
        }
        return allContacts;
    }

    public static ObservableList<ContactsModel> getContactByID(int contactId) throws SQLException {
        contactNameByID.clear();
        String sql = "SELECT a.Appointment_ID, a.Contact_ID, c.Contact_Name " +
                "FROM appointments a " +
                "JOIN contacts c " +
                "ON a.Contact_ID = c.Contact_ID " +
                "WHERE Contact_ID = ? ";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
        ps.setInt(1, contactId);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int contactID = rs.getInt("Contact_ID");
            String contactName = rs.getString("Contact_Name");
            ContactsModel contact = new ContactsModel(contactID, contactName);
            contactNameByID.add(contact);
        }
        return contactNameByID;
    }
}



