package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.*;
import util.*;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

//import static util.CountryUtil.getTheCountry;

/** Class that allows updates to current customers. */
public class UpdateCustomerController implements Initializable {
    public TextField customerIdTxt;
    public TextField nameTxt;
    public TextField addressTxt;
    public TextField searchByCustomerName;
    @FXML
    private ComboBox<CountryModel> countryComboBox;
    @FXML
    private ComboBox<FirstLevelDivisionModel> firstLevelDivisionComboBox;
    public TextField customerPostalCode;
    public TextField customerPhone;
    public TableView addCustomerTable;
    public TableColumn tableCustomerID;
    public TableColumn tableCustomerName;
    public TableColumn tableAddress;
    public TableColumn tablePostalCode;
    public TableColumn tablePhone;
    public TableColumn tableDivisionID;
    public TableColumn tableCountryID;
    public Button saveUpdateButton;

    /**
     * Initializes the Update Customer page. Sets the table with current customer data from the database. Sets the countries combo box.
     *
     * @param url            url
     * @param resourceBundle resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        tableCustomerID.setCellValueFactory(new PropertyValueFactory<>("customerID"));
        tableCustomerName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        tableAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tablePostalCode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));
        tablePhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        tableDivisionID.setCellValueFactory(new PropertyValueFactory<>("divisionID"));
        tableCountryID.setCellValueFactory(new PropertyValueFactory<>("countryID"));


        try {
            addCustomerTable.setItems(CustomerUtil.getAllCustomers());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        //Sets the countryComboBox;
        try {
            countryComboBox.setItems(CountryUtil.getAllCountries());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NullPointerException n) {
            return;
        }
    }

    /**
     * Action event that sets the firstLevelDivisionComboBox based on the CountryID
     *
     * @param actionEvent actionEvent
     */
    public void countrySelected(ActionEvent actionEvent) {
        CountryModel c = countryComboBox.getValue();
        //countryTxt.setText(String.valueOf(countryComboBox.getValue()));

        try {
            firstLevelDivisionComboBox.setPromptText(null);
            firstLevelDivisionComboBox.setValue(null);
            firstLevelDivisionComboBox.setItems(FirstLevelDivisionsUtil.getAllDivisions(c.getCountryId()));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NullPointerException n) {
            return;
        }
    }

    /**
     * Action event to first delete customer appointments based on CustomerID, then delete the customer from the customers table
     * upon pressing the "Delete Customer Button".
     */
    public void deleteCustomerButtonPressed(ActionEvent actionEvent) throws SQLException {
        CustomerModel selectedCustomer = (CustomerModel) addCustomerTable.getSelectionModel().getSelectedItem();

        if (selectedCustomer == null) {
            Alert invalidEntry = new Alert(Alert.AlertType.ERROR);
            invalidEntry.setContentText("Must select a customer to be deleted.");
            invalidEntry.showAndWait();
            return;
        }

        int customerID = selectedCustomer.getCustomerID();
        CustomerUtil.deleteCustomerAppointments(customerID);
        CustomerUtil.deleteCustomer(customerID);
        addCustomerTable.setItems(CustomerUtil.getAllCustomers());
    }

    /**
     * Action event that populates the updatable fields with customer data. The data based on the selected customer from the
     * table once the "Select Customer To Update Button" is pushed. Also sets the country combo box to all countries, so the country and
     * first level divisions may be updated.
     *
     * @param actionEvent actionEvent
     */
    public void SelectCustomerToUpdateButtonPushed(ActionEvent actionEvent) throws SQLException {
        searchByCustomerName.clear();
        CustomerModel selectedCustomer = (CustomerModel) addCustomerTable.getSelectionModel().getSelectedItem();
        if (customerIdTxt.equals(null)) {
            Alert invalidEntry = new Alert(Alert.AlertType.ERROR);
            invalidEntry.setContentText("Must select a customer to be updated.");
            invalidEntry.showAndWait();
            return;
        }


        try {
            addCustomerTable.setItems(CustomerUtil.getAllCustomers());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            countryComboBox.setPromptText(String.valueOf(CountryUtil.getTheCountry(selectedCustomer.getCountryID())));
            firstLevelDivisionComboBox.setPromptText(String.valueOf(FirstLevelDivisionsUtil.getTheDivision(selectedCustomer.getDivisionID())));
            firstLevelDivisionComboBox.setItems(FirstLevelDivisionsUtil.getAllDivisions(selectedCustomer.getCountryID()));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NullPointerException n) {
            Alert invalidEntry = new Alert(Alert.AlertType.ERROR);
            invalidEntry.setContentText("Must select a customer to be updated.");
            invalidEntry.showAndWait();
            return;
        }


        customerIdTxt.setText(String.valueOf(selectedCustomer.getCustomerID()));
        nameTxt.setText(selectedCustomer.getCustomerName());
        addressTxt.setText(selectedCustomer.getAddress());
        customerPostalCode.setText(selectedCustomer.getPostalCode());
        countryComboBox.setItems(CountryUtil.getAllCountries());
        customerPhone.setText(selectedCustomer.getPhone());

    }

    /**
     * Action event that saves the updated customer data to the customer table in the database and the GUI once the
     * " Save Update Button is pushed". It does not save unless all fields are filled. There's a alert if all fields are
     * not filled.
     *
     * @param actionEvent actionEvent
     */
    public void saveUpdateButtonPushed(ActionEvent actionEvent) throws SQLException {

        if (customerIdTxt.getText().isEmpty()) {
            Alert invalidEntry = new Alert(Alert.AlertType.ERROR);
            invalidEntry.setContentText("Must select a customer to be updated.");
            invalidEntry.showAndWait();
            return;
        }

        if (nameTxt.getText().isEmpty() || addressTxt.getText().isEmpty() || customerPostalCode.getText().isEmpty() || customerPhone.getText().isEmpty()) {
            Alert invalidEntry = new Alert(Alert.AlertType.ERROR);
            invalidEntry.setContentText("All fields must be filled.");
            invalidEntry.showAndWait();
            return;
        }

        if (countryComboBox.getValue() == null && firstLevelDivisionComboBox.getValue() == null) {
            try {
                int customerID = Integer.parseInt(customerIdTxt.getText());
                String customerName = nameTxt.getText();
                String address = addressTxt.getText();
                String postalCode = customerPostalCode.getText();
                String phone = customerPhone.getText();
                String createdBy = "Lynn";
                Timestamp lastUpdate = Timestamp.valueOf(LocalDateTime.now());
                String lastUpdatedBy = "Lynn";

                CustomerUtil.updatePartialCustomerTable(customerID, customerName, address, postalCode, phone, createdBy, lastUpdate, lastUpdatedBy);
                addCustomerTable.setItems(CustomerUtil.getAllCustomers());

                customerIdTxt.clear();
                nameTxt.clear();
                addressTxt.clear();
                countryComboBox.setPromptText(null);
                firstLevelDivisionComboBox.setPromptText(null);
                customerPostalCode.clear();
                customerPhone.clear();


            } catch (SQLException e) {
                e.printStackTrace();
                return;
            }
        } else {
            try {
                int customerID = Integer.parseInt(customerIdTxt.getText());
                String customerName = nameTxt.getText();
                String address = addressTxt.getText();
                String postalCode = customerPostalCode.getText();
                String phone = customerPhone.getText();
                Timestamp createDate = Timestamp.valueOf(LocalDateTime.now());
                String createdBy = "Lynn";
                Timestamp lastUpdate = Timestamp.valueOf(LocalDateTime.now());
                String lastUpdatedBy = "Lynn";
                int divisionID = firstLevelDivisionComboBox.getValue().getDbDivisionId();

                CustomerUtil.updateCustomerTable(customerID, customerName, address, postalCode, phone, createDate, createdBy, lastUpdate, lastUpdatedBy, divisionID);
                addCustomerTable.setItems(CustomerUtil.getAllCustomers());

                customerIdTxt.clear();
                nameTxt.clear();
                addressTxt.clear();
                countryComboBox.getSelectionModel().clearSelection();
                firstLevelDivisionComboBox.getSelectionModel().clearSelection();
                customerPostalCode.clear();
                customerPhone.clear();


            } catch (NullPointerException n) {
                Alert allFields = new Alert(Alert.AlertType.ERROR);
                allFields.setTitle("ERROR");
                allFields.setContentText("Must select a State/Province");
                allFields.showAndWait();
                return;
            }
        }
    }

    /**
     * Action event to take the user back to the Menu Page once the "Back To Menu Page"is pushed.
     *
     * @param actionEvent actionEvent
     */
    public void backToMenuPagePushed(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/menuPage.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 500, 500.0));
        stage.show();
    }

    public void onSearchByCustomerName(ActionEvent actionEvent) {
        String partialCustomerName = searchByCustomerName.getText().toLowerCase();
        ObservableList<CustomerModel> customerFound = CustomerUtil.lookUpCustomer(partialCustomerName);

        if (customerFound.size() == 0) {
            Alert customerNotFound = new Alert(Alert.AlertType.INFORMATION);
            customerNotFound.setTitle("INFORMATION");
            customerNotFound.setContentText("No matches found");
            customerNotFound.showAndWait();
        } else

            addCustomerTable.setItems(customerFound);
    }
}








