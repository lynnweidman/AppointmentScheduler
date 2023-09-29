package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;

/** Class to have Constructors and Getters and Setters to generate business reports */
public class BusinessReportsModel {
    private int appointmentID;
    private String title;
    private String description;
    private String location;
    private String contact;
    private String type;
    private LocalDateTime ldtStart;
    private LocalDateTime ldtEnd;
    private Timestamp end;
    private String createdBy;
    private String lastUpdatedBy;
    private int customerID;
    private int userID;
    private int contactID;
    private int total;
    private int numberOfAppointments;
    private Month month;
    private String date;

    /** Constructor for getting the contact schedule.
     @param contact contact
     @param appointmentID appointmentID
     @param title title
     @param type type
     @param description description
     @param ldtStart ldtStart
     @param ldtEnd ldtEnd
     @param customerID customerID */
    public BusinessReportsModel(String contact, int appointmentID, String title, String type, String description,
                                LocalDateTime ldtStart, LocalDateTime ldtEnd, int customerID) {

        this.contact = contact;
        this.appointmentID = appointmentID;
        this.title = title;
        this.description = description;
        this.type = type;
        this.ldtStart = ldtStart;
        this.ldtEnd = ldtEnd;
        this.customerID = customerID;

    }

    /** Constructor for getting Appointments By type And Month.
     @param total total
     @param  type type
     @param month month */
    public BusinessReportsModel(int total, String type, Month month) {

        this.total = total;
        this.type = type;
        this.month = month;
    }

    /** Constructor for getting numberOfAppointments of appointments by date.
     @param numberOfAppointments numberOfAppointments
      @param  date date */
    public BusinessReportsModel(int numberOfAppointments, String date ) {

        this.numberOfAppointments= numberOfAppointments;
        this.date = date;

    }

    /**  Gets the appointmentID
     * @return appointmentID */
    public int getAppointmentID() {
        return appointmentID;
    }
 /** Sets the appointmentID
  @param appointmentID appointmentID */
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    /**Gets the title.
     * @return title */
    public String getTitle() {
        return title;
    }

    /** Sets the title.
     @param title  title */
    public void setTitle(String title) {
        this.title = title;
    }

    /** Gets description.
     * @return description */
    public String getDescription() {
        return description;
    }

    /** Sets description.
     * @param  description description */
    public void setDescription(String description) {
        this.description = description;
    }

    /** Gets location.
     * @return location */
    public String getLocation() {
        return location;
    }

    /** Sets location.
     * @param location location */
    public void setLocation(String location) {
        this.location = location;
    }

    /** Gets type.
     * @return type */
    public String getType() {
        return type;
    }

    /** Sets type.
     * @param type type */
    public void setType(String type) {
        this.type = type;
    }


 /** returns ldtStart.
  * @return ldtStart */
    public LocalDateTime getLdtStart() {
        return ldtStart;
    }

    /**sets ldtStart.
     * @param ldtStart ldtStart */
    public void setLdtStart(LocalDateTime ldtStart) {
        this.ldtStart = ldtStart;
    }

    /** Returns ldtEnd.
     * @return  ldtEnd */
    public LocalDateTime getLdtEnd() {
        return ldtEnd;
    }

    /** Sets ldtEnd.
     * @param ldtEnd ldtEnd */
    public void setLdtEnd(LocalDateTime ldtEnd) {
        this.ldtEnd = ldtEnd;
    }

    /** Gets end.
     * @return end */
    public Timestamp getEnd() {
        return end;
    }

    /** Sets end.
     * @param end end */
    public void setEnd(Timestamp end) {
        this.end = end;
    }

    /** GEts createdBy.
     * @return createdBy */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Sets createdBy.
     * @param createdBy createdBy */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

/** Gets lastUpdatedBy.
 * @return lastUpdatedBy */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /** Sets lastUpdatedBy.
     * @param lastUpdatedBy lastUpdatedBy */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /** Gets customerID.
     * @return customerID */
    public int getCustomerID() {
        return customerID;
    }

    /** Sets customerID.
     * @param customerID  customerID*/
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /** Gets userID.
     * @return userID */
    public int getUserID() {
        return userID;
    }

    /** Sets userID.
     * @param userID userID */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /** Gets contactID.
     * @return contactID */
    public int getContactID() {
        return contactID;
    }

    /** Sets contactID.
     * @param contactID contactID */
    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    /**Gets numberOfAppointments.
     * @return numberOfAppointments */
    public int getNumberOfAppointments() {
        return numberOfAppointments;
    }

    /** Sets numberOfAppointments.
     * @param numberOfAppointments numberOfAppointments */
    public void setNumberOfAppointments(int numberOfAppointments) {
        this.numberOfAppointments = numberOfAppointments;
    }

    /** Gets contact.
     * @return contact */
    public String getContact() {
        return contact;
    }

    /** Sett contact.
     * @param contact contact*/
    public void setContact(String contact) {
        this.contact = contact;
    }

    /** Gets month.
     * @return month*/
    public Month getMonth() {
        return month;
    }

    /** Sets month.
     * @param month month*/
    public void setMonth(Month month) {
        this.month = month;
    }

    /** Gets date.
     * @return date */
    public String getDate() {
        return date;
    }

    /** Sets date.
     * @param date date */
    public void setDate(String date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
