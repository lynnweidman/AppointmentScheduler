package model;


import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/** Class with Constructors and Setters and Getters for Adding Appointments. */
public class AddAppointmentsModel {

    private int appointmentID;
    private String title;
    private String description;
    private String location;
    private String type;
    private LocalDateTime ldtStart;
    private LocalDateTime ldtEnd;
    private ZonedDateTime zonedCreateDate;
    private LocalDateTime createDate;
    private String createdBy;
    private ZonedDateTime zonedLastUpdate ;
    private LocalDateTime lastUpdate;
    private String lastUpdatedBy;
    private int customerID;
    private int userID;
    private int contactID;
    private String userName;

/** Add Appointments Constructor.
 @param appointmentID
 @param title
 @param description
 @param location
 @param type
 @param ldtStart
 @param ldtEnd
 @param zonedCreateDate
 @param createdBy
 @param zonedLastUpdate
 @param lastUpdatedBy
 @param customerID
 @param userID
 @param contactID */
    public AddAppointmentsModel(int appointmentID, String title, String description, String location, String type,
                                LocalDateTime ldtStart, LocalDateTime ldtEnd, ZonedDateTime zonedCreateDate, String createdBy,
                                ZonedDateTime zonedLastUpdate, String lastUpdatedBy, int customerID, int userID, int contactID) {
        this.appointmentID = appointmentID;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.ldtStart = ldtStart;
        this.ldtEnd = ldtEnd;
        this.zonedCreateDate = zonedCreateDate;
        this.createdBy = createdBy;
        this.zonedLastUpdate = zonedLastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.customerID = customerID;
        this.userID = userID;
        this.contactID = contactID;
    }

    public AddAppointmentsModel(int appointmentID, String title, String description, String location, String Type,
                                LocalDateTime ldtStart, LocalDateTime ldtEnd, LocalDateTime createDate, String createdBy,
                                LocalDateTime lastUpdate, String lastUpdatedBy, int customerID, int userID, int contactID) {
        this.appointmentID = appointmentID;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = Type;
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


/** Gets the appointmentID.
 @return  appointment_ID */
    public int getAppointmentID() {
        return appointmentID;
    }
/** Sets the appointmentID.
  @param appointmentID appointmentID  */
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    /** Gets the title.
     @return title */
    public String getTitle() {
        return title;
    }

    /** Sets the title.
     @param title title*/
    public void setTitle(String title) {
        this.title = title;
    }

    /** Gets the description.
     @return description */
    public String getDescription() {
        return description;
    }

 /** sets the description.
  @param description description */
    public void setDescription(String description) {
        this.description = description;
    }

/** Gets the location.
 @return location */
    public String getLocation() {
        return location;
    }

 /** Sets the location.
  @param location location */
    public void setLocation(String location) {
        this.location = location;
    }


/** Gets the type.
 @return  type */
    public String getType() {
        return type;
    }

    /** Sets the type.
     @param type  type */
    public void setType(String type) {
        this.type = type;
    }

    /** Gets the LocalDateTime Start.
     @return ldtStart */
    public LocalDateTime getLdtStart() {
        return ldtStart;
    }

/** /** Gets the LocalDateTime End.
 @return ldtEnd */
    public LocalDateTime getLdtEnd() {
        return ldtEnd;
    }

    /** Gets createdBy.
     @return createdBy */
    public String getCreatedBy() {
        return createdBy;
    }

    /**Sets createdBy.
     @param createdBy createdBy*/
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

   /** Gets lastUpdatedBy.
    @return  lastUpdatedBy */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /** Sets lastUpdatedBy.
     @param lastUpdatedBy lastUpdatedBy*/
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /** Gets the customerID.
     @return customerID */
    public int getCustomerID() {
        return customerID;
    }

    /** Sets the customerID.
     @param customerID customerID*/
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public ZonedDateTime getZonedCreateDate() {
        return zonedCreateDate;
    }

    public void setZonedCreateDate(ZonedDateTime zonedCreateDate) {
        this.zonedCreateDate = zonedCreateDate;
    }

    public void setLdtStart(LocalDateTime ldtStart) {
        this.ldtStart = ldtStart;
    }

    public void setLdtEnd(LocalDateTime ldtEnd) {
        this.ldtEnd = ldtEnd;
    }

    public ZonedDateTime getZonedLastUpdate() {
        return zonedLastUpdate;
    }

    public void setZonedLastUpdate(ZonedDateTime zonedLastUpdate) {
        this.zonedLastUpdate = zonedLastUpdate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
