package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;


/** Class with Constructors and Setters and Getters for Updating Appointments. */
public class UpdateAppointmentModel {
    private int appointmentID;
    private String title;
    private String description;
    private String location;
    private String type;
    private Timestamp start;
    private Timestamp end;
    private String createdBy;
    private String lastUpdatedBy;
    private int customerID;
    private int userID;
    private int contactID;
    private int year;
    private Month month;
    private int date;
    private int hour;
    private int minutes;
    private LocalDateTime ldtStart;
    private LocalDateTime ldtEnd;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdate;


/** Update Appointment Constructor.
 @param appointmentID appointmentID
 @param title title
 @param description description
 @param location location
 @param type type
 @param createDate createDate
 @param createdBy createdBy
 @param lastUpdate lastUpdate
 @param lastUpdatedBy lastUpdatedBy
 @param customerID customerID
 @param userID userID
 @param contactID contactID */

    public UpdateAppointmentModel(int appointmentID, String title, String description, String location, String type,
                                  LocalDateTime ldtStart, LocalDateTime ldtEnd, LocalDateTime createDate, String createdBy,
                                  LocalDateTime lastUpdate, String lastUpdatedBy, int customerID, int userID, int contactID) {
        this.appointmentID = appointmentID;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.ldtStart = ldtStart;
        this.ldtEnd = ldtEnd;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.customerID = customerID;
        this.userID = userID;
        this.contactID = contactID;
    }

    public UpdateAppointmentModel(int appointmentID, String title, String description, String location, String type,
                                  LocalDateTime ldtStart, LocalDateTime ldtEnd, LocalDateTime lastUpdate, String lastUpdatedBy,
                                  int customerID, int userID, int contactID) {
        this.appointmentID = appointmentID;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.ldtStart = ldtStart;
        this.ldtEnd = ldtEnd;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.customerID = customerID;
        this.userID = userID;
        this.contactID = contactID;
    }

/** Gets the Hours.
 @return hour */
    public int getHours() {
        return hour;
    }

    /** Gets the appointmentID
     @return appointmentID */
    public int getAppointmentID() {
        return appointmentID;
    }

    /** Sets the appointmentID
     @param appointmentID appointmentID*/
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    /**Gets the title.
     @return title */
    public String getTitle() {
        return title;
    }

    /** Sets the title.
     @param title title */
    public void setTitle(String title) {
        this.title = title;
    }

    /** Gets the description.
     @return description */
    public String getDescription() {
        return description;
    }

    /** Sets the description.
     @param description description */
    public void setDescription(String description) {
        this.description = description;
    }

    /** Gets the location.
     @return location */
    public String getLocation() {
        return location;
    }

    /**Sets the location.
     @param location location */
    public void setLocation(String location) {
        this.location = location;
    }

/** Gets the type.
 @return type */
    public String getType() {
        return type;
    }

    /**Sets the type.
     @param type type */
    public void setType(String type) {
        this.type = type;
    }

    /** Gets the start.
     @return start */
    public Timestamp getStart() {
        return start;
    }

    /** Sets the start.
     @param start start */
    public void setStart(Timestamp start) {
        this.start = start;
    }

    /** Gets the end.
     @return end */
    public Timestamp getEnd() {
        return end;
    }

    /** Sets the end.
     @param end end */
    public void setEnd(Timestamp end) {
        this.end = end;
    }

/** Gets createdBy.
 @return createdBy */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Sets createdBy.
     @param createdBy createdBy */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

/**Gets lastUpdatedBy.
 @return  lastUpdatedBy */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /** Sets lastUpdatedBy.
     @param lastUpdatedBy lastUpdatedBy */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /** Gets the customerID.
     @return customerID */
    public int getCustomerID() {
        return customerID;
    }

    /** Sets the customerID.
     @param customerID customerID */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    /** Gets the Date.
     @return date */
    public int getDate() {
        return date;
    }

    /** Sets The Date.
     @param date date*/
    public void setDate(int date) {
        this.date = date;
    }

/** Gets the Minutes.
 @return minutes */
    public int getMinutes() {
        return minutes;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
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


}





