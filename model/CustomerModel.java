
package model;

/** Class with a Constructor and Setters and Getters for adding and updating Customers. */
public class CustomerModel {
  private  int customerID;
  private  String customerName;
  private String address;
  private  String postalCode;
  private String phone;
  private int divisionID;
  private int countryID;

/** The Constructor for Customers.
 * @param customerID customerID
 * @param customerName customerName
 * @param address address
 * @param postalCode postalCode
 * @param phone phone
 * @param divisionID divisionID
 * @param countryID countryID */
    public CustomerModel(int customerID, String customerName, String address, String postalCode, String phone, int divisionID, int countryID) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
        this.divisionID = divisionID;
        this.countryID = countryID;
    }
    public CustomerModel(int customerID, String customerName, String address, String postalCode, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
    }

    public CustomerModel (String customerName) {
        this.customerName = customerName;
    }

/** Gets the customerID
 @return customerID*/
    public int getCustomerID() {
        return customerID;
    }

    /** Sets the customerID.
     @param customerID customerID */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**Gets the Customer Name.
     @return customerName */
    public String getCustomerName() {
        return customerName;
    }

/** Gets the address.
 @return address*/
    public String getAddress() {
        return address;
    }

/** Gets the postalCode.
 @return postalCode */
    public String getPostalCode() {
        return postalCode;
    }

    /**Gets the phone.
     @return  phone */
    public String getPhone() {
        return phone;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }
}

