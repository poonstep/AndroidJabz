package demo.arit.com.dmo3.model;

import org.parceler.Parcel;

@Parcel
public class User {
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
