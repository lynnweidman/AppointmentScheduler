package model;

import java.time.LocalDateTime;

/** Class to have Constructors and Getters and Setters to view appointments by week or month. */
public class AppointmentViewModel {

    private int week;
    private int appointmentID;
    private String title;
    private String description;
    private String location;
    private String contactName;
    private String type;
    private LocalDateTime ldtStart;
    private LocalDateTime ldtEnd;
    private int customerID;
    private int userID;

/** Constructor to view appointments by week or month.
 * @param week week
 * @param appointmentID appointmentID
 * @param title title
 * @param description description
 * @param location location
 * @param contactName contactName
 * @param type type
 * @param ldtStart ldtStart
 * @param ldtEnd ldtEnd
 * @param customerID customerID
 * @param userID userID */
    public AppointmentViewModel(int week, int appointmentID, String title, String description, String location, String contactName,
                                String type, LocalDateTime ldtStart, LocalDateTime ldtEnd, int customerID, int userID) {
        this.week = week;
        this.appointmentID = appointmentID;
        this.title = title;
        this.description = description;
        this.location = location;
        this.contactName = contactName;
        this.type = type;
        this.ldtStart = ldtStart;
        this.ldtEnd = ldtEnd;
        this.customerID = customerID;
        this.userID = userID;

    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getLdtStart() {
        return ldtStart;
    }

    public void setLdtStart(LocalDateTime ldtStart) {
        this.ldtStart = ldtStart;
    }

    public LocalDateTime getLdtEnd() {
        return ldtEnd;
    }

    public void setLdtEnd(LocalDateTime ldtEnd) {
        this.ldtEnd = ldtEnd;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


}
