package model;

/** Class that contains Constructors and Getters and Setters for contact Ids and contacts names. */
public class ContactsModel {
    private int contactID;
    private String contactName;
    private int appointmentID;

/** Constructor to supply contactID and contactName.
 * @param contactID contactID
 * @param contactName contactName */
    public ContactsModel(int contactID, String contactName) {
        this.contactID = contactID;
        this.contactName = contactName;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    /** Converts contactName to String.
     * @return contactName */
    public String getContactName() {
        return contactName;
    }

    /** Setter for contactName.
     * @param contactName contactName*/
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /** Converts contactName to String.
     * @return contactName */
    public String toString() {
        return contactName;
    }

    /** Gets appointmentID.
     * @return appointmentID */
    public int getAppointmentID() {
        return appointmentID;
    }

    /** Sets appointmentID.
     * @param appointmentID appointmentID */
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }
}


