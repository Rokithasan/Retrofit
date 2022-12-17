package rokit.com.retrofitconnection.model;

public class UserModel {

    int id;
    String email;
    String firstName;
    String lastName;
    String avater;
    SupportUser support;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public SupportUser getSupport() {
        return support;
    }

    public void setSupport(SupportUser support) {
        this.support = support;
    }
    
}
