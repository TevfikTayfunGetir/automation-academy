package week4;

public class UserInformation {
    private String name;
    private String userName;
    private String password;
    private String phoneNumber;
    private String address;

    UserInformation(String name, String userName, String password, String phoneNumber, String address) {
        setName(name);
        setUserName(userName);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
