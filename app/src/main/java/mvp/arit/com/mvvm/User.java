package mvp.arit.com.mvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

//public class User{
public class User extends BaseObservable{
    private String firstname;
    private String lastname;

    User(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Bindable
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        notifyPropertyChanged(BR.firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
