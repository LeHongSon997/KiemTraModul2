package quanly.model;

public class Contact {
    private String name;
    private String phoneNumber;
    private int group;
    private String gender;
    private String address;
    private String email;
    private String facebook;

    public Contact(String name, String phoneNumber, int group, String gender, String address) {
    }

    public Contact(String name, String phoneNumber, int group, String gender, String address, String email, String facebook) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  name + " , " + phoneNumber + " , " + group + " , " + gender + " , " + address + " , " + email + " , " + facebook ;
    }
}
