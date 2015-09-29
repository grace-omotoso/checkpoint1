package checkpoint.andela.main;

import org.joda.time.DateTime;



import java.util.concurrent.TimeUnit;

/**
 * Represents member information.
 */

public class Member {

    /**
     * Member Class Properties
     */
    private String fullName;

    private char gender;

    private String dateOfBirth;

    private String emailAddress;

    private String phoneNumber;

    private DateTime dateOfRegistration;

    /**
     * Create a new member with default properties
     */
    public Member(){
    }

    /**
     *  Create a new member with specific properties
     */
    public Member(String fullName,char gender,String dateOfBirth, String emailAddress, String phoneNumber){

        this.fullName =  fullName;

        this.gender = gender;

        this.dateOfBirth = dateOfBirth;

        this.emailAddress = emailAddress;

        this.phoneNumber =  phoneNumber;

        this.dateOfRegistration = getDateOfRegistration();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DateTime getDateOfRegistration() {
        getCurrentDate();
        return  dateOfRegistration;
    }

    public void setDateOfRegistration(DateTime dateOfRegistration)  {

        this.dateOfRegistration = dateOfRegistration;
    }

    public DateTime getCurrentDate(){

        /**
         * Delay this execution for 2ms incase Members are created consecutively
         * This will make registration date unique
         */

        try{
            Thread.currentThread().sleep(1);
        }
        catch (Exception e){

        }

        DateTime registrationDate = DateTime.now();
        this.dateOfRegistration = registrationDate;
        return  registrationDate;
    }
    public void borrowBook(Book book){
    }

    public void returnBook(Book book){

    }

}
