package model;

/** Class with a Constructor and Setter and Getters for the User Log In page. */
public class UserModel {
    private int userID;
    private String userName;
    private String userPassword;

    /**
     * Constructor for the User Log In
     *
     * @param userID userID
     * @param userName userName
     * @param userPassword userPassword
     */
    public UserModel(int userID, String userName, String userPassword) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public UserModel(String userName) {
        this.userName = userName;
    }

   /* public UserModel(int userID, String userName) {
        this.userID = userID;
        this.userName = userName;

    }

    public UserModel(int userID) {
        this.userID = userID;
    }*/

    /**
     * Gets the User_ID
     *
     * @return userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Gets the UserName.
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets the User Password.
     *
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * Sets the User Name to String.
     *
     * @return userName
     */
    public String toString() {
        return userName;
    }
}






