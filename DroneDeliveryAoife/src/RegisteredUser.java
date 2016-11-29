import java.util.List;

/**
 * Created by t00180243 on 23/11/2016.
 */
public class RegisteredUser {
    private String username;
    private String userFullName;
    private String address;
    private String password;
    private int phoneNumber;


    public RegisteredUser(String username, String userFullName, String address, String password, int phoneNumber) {
        this.username = username;
        this.userFullName = userFullName;
        this.address = address;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
