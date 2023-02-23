import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class represents a profile of a person in our social network.
 */
public class Profile {
    public String firstName;
    public String lastName;
    public int day;
    public int month;
    public int year;
    public String emailAddress;
    public String [] interests;
    public String [] activitiesAndGroups;
    ArrayList <Profile> friends = new ArrayList<>();

    /**
     * Constructor for a new profile.
     *
     * @param firstName
     * @param lastName
     * @param day
     * @param month
     * @param year
     * @param emailAddress
     * @param interests
     * @param activitiesAndGroups
     */
    public Profile(String firstName, String lastName, int day, int month, int year, String emailAddress, String[] interests,
                   String[] activitiesAndGroups) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.emailAddress = emailAddress;
        this.interests = interests;
        this.activitiesAndGroups = activitiesAndGroups;
    }

    /**
     * Sets profile's first name.
     *
     * @param newFirstName
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    /**
     * Get profile's first name.
     *
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets profile's last name.
     *
     * @param newLastName
     */
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    /**
     * Get profile's last name.
     *
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets profile's user date of birth.
     *
     * @param day
     * @param month
     * @param year
     */
    public void setDateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Get profile's user date of birth.
     *
     * @return date of birth
     */
    public String getDateOfBirth() {
        return day +"-"+ month +"-"+ year;

    }

    /**
     * Sets profile's email.
     *
     * @param newEmailAddress
     */
    public void setEmailAddress(String newEmailAddress) {
        this.emailAddress = newEmailAddress;
    }

    /**
     * Get profile's email.
     *
     * @return email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets profile's interest.
     *
     * @param newInterest
     */
    public void setInterests(String newInterest) {
        String [] newArr = Arrays.copyOf(interests,interests.length+1);
        newArr[newArr.length-1] = newInterest;
    }

    /**
     * Get profile's interests.
     *
     * @return interests
     */
    public String getInterests() {
        return Arrays.toString(interests);
    }

    /**
     * Sets profile's activities and groups.
     *
     * @param newActivitiesAndGroups
     */
    public void setActivitiesAndGroups(String newActivitiesAndGroups) {
        String [] newArr = Arrays.copyOf(activitiesAndGroups,activitiesAndGroups.length+1);
        newArr[newArr.length-1] = newActivitiesAndGroups;
    }

    /**
     * Get profile's activities and groups.
     *
     * @return activities and groups
     */
    public String getActivitiesAndGroups() {
        return Arrays.toString(activitiesAndGroups);
    }

    /**
     * Adds a friend to the list.
     *
     * @param p
     */
    void insertFriend(Profile p) {
        friends.add(p);
    }

    /**
     * Gets friend i from the friends list.
     *
     * @param i
     * @return friend
     */
    Profile getFriend(int i) {
        return friends.get(i);
    }

    /**
     * Gets the profile's number of friends.
     *
     * @return number of friends
     */
    int numOfFriends() {
        return friends.size();
    }

    /**Returns profile's first name, last name, doB and email address.*/
    public String toString() {
        return getFirstName() + "\n" + getLastName() + "\n" + getDateOfBirth() + "\n" + getEmailAddress();
    }
}
