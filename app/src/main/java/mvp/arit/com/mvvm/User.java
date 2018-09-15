package mvp.arit.com.mvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.math.BigDecimal;

//public class User{
public class User extends BaseObservable{
    private String firstname;
    private String lastname;
    private BigDecimal age;

    public BigDecimal getAge(){
        return age;
    }

    public void setAge(BigDecimal age){
        this.age = age;
    }

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
