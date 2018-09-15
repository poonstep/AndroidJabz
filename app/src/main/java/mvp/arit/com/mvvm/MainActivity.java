package mvp.arit.com.mvvm;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import mvp.arit.com.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ClickHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        User user = new User("John","Doe");
        binding.setUser(user);
        binding.setHandler(this);
    }

    @Override
    public void onButtonClick(User user) {
        Toast.makeText(this, "User" + user.getFirstname(), Toast.LENGTH_SHORT).show();
    }

}
