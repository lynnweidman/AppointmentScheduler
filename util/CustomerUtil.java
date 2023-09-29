package util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/** This class works with customer data from the customer and first_level_division tables. */
public class CustomerUtil {
    public static ObservableList<CustomerModel> addCustomer = FXCollections.observableArrayList();


    /** Method gets customer's data from the customer and first_level_division table and adds it to the addCustomer ObservableList.
     @return addCustomer used to populate customer table in the GUI. */
    public static ObservableList getAllCustomers() throws SQLException {
        addCustomer.clear();
        String sql = "SELECT Customer_ID, Customer_Name, Address, Postal_Code, Phone, cu.Division_ID, fld.Country_ID FROM client_schedule.customers cu\n" +
                "INNER JOIN first_level_divisions fld ON\n" +
                "cu.Division_Id = fld.Division_Id;";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        while (rs.next()) {
            int customerID = rs.getInt("Customer_ID");
            String customerName = rs.getString("Customer_Name");
            String address = rs.getString("Address");
            String postalCode = rs.getString("Postal_Code");
            String phone = rs.getString("Phone");
            int divisionID = rs.getInt("Division_ID");
            int countryID = rs.getInt("Country_ID");
            CustomerModel addC = new CustomerModel(customerID, customerName, address, postalCode, phone, divisionID, countryID);
            addCustomer.add(addC);
        }
        return addCustomer;

    }



/** Method to get the highest Customer_ID from the customers table. Used to set a unique Id for new customers.
 @return  ++customer_ID */
    public static int getCustomerID() throws SQLException {
        int customerID = 0;
        String sql = "SELECT Max(Customer_ID) FROM customers;";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);

        while (rs.next()) {
            customerID = (rs.getInt(1));
        }

        return ++customerID;
    }


/** Method deletes customers from the customers table based on CustomerID. */
    public static void deleteCustomer(int customerID) throws SQLException {

        String sql = "DELETE FROM customers WHERE Customer_ID = ?";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
        ps.setInt(1, customerID);
        ps.executeUpdate();
    }

    /** Method updates the customer data based on input from the GUI. It uses the Customer_ID to identify which customer to update.
     @param customerID  input customerID used to identify the customer.
     @param customerName input customerName
     @param address input address
     @param postalCode input postal_Code
     @param phone  input phone
     @param createDate input create_date
     @param createdBy input created_By
     @param lastUpdate input last_update
     @param lastUpdatedBy input last_updated_by
     @param divisionID input division_ID */

    public static void updateCustomerTable(int customerID, String customerName, String address, String postalCode,
                                           String phone, Timestamp createDate, String createdBy, Timestamp lastUpdate,
                                           String lastUpdatedBy, int divisionID) throws SQLException {

        String sql = "UPDATE  customers " +
                "SET Customer_Name = ?, Address = ?, Postal_Code = ?, Phone = ?, Create_Date = ?, Created_By = ?, Last_Update = ?, Last_Updated_By = ?, Division_ID = ? " +
                "WHERE Customer_ID = ? ";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

        try {

            ps.setString(1, customerName);
            ps.setString(2, address);
            ps.setString(3, postalCode);
            ps.setString(4, phone);
            ps.setTimestamp(5, createDate);
            ps.setString(6, createdBy);
            ps.setTimestamp(7, lastUpdate);
            ps.setString(8, lastUpdatedBy);
            ps.setInt(9, divisionID);
            ps.setInt(10, customerID);

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void updatePartialCustomerTable(int customerID, String customerName, String address, String postalCode,
                                                  String phone, String createdBy, Timestamp lastUpdate,
                                                  String lastUpdatedBy) throws SQLException {

        String sql = "UPDATE  customers " +
                "SET Customer_Name = ?, Address = ?, Postal_Code = ?, Phone = ?, Created_By = ?, Last_Update = ?, Last_Updated_By = ? " +
                "WHERE Customer_ID = ? ";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);

        try {

            ps.setString(1, customerName);
            ps.setString(2, address);
            ps.setString(3, postalCode);
            ps.setString(4, phone);
            ps.setString(5, createdBy);
            ps.setTimestamp(6, lastUpdate);
            ps.setString(7, lastUpdatedBy);
            ps.setInt(8, customerID);

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    /** Method deletes customer appointment from the appointments table based on Customer_ID. */
    public static void deleteCustomerAppointments(int customerID) throws SQLException {

        String sql = "DELETE FROM appointments WHERE Customer_ID = ?";
        PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
        ps.setInt(1, customerID);
        ps.executeUpdate();
    }


    public static ObservableList<CustomerModel> lookUpCustomer(String customerName) {
        ObservableList<CustomerModel> customerFound = FXCollections.observableArrayList();

            for (CustomerModel theCustomer : addCustomer ) {
                if (theCustomer.getCustomerName().toLowerCase().contains(customerName)) {

                    customerFound.add(theCustomer);
                }
        }
            return customerFound;
    }

}



















