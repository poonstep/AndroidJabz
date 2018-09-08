package demo.arit.com.dmo3;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.parceler.Parcels;

import butterknife.ButterKnife;
import butterknife.OnClick;
import demo.arit.com.dmo3.model.User;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void sendMessage(){
        Intent intent = new Intent();
        intent.setClass(this,DestinationActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

//        intent.putExtra(MESSAGE,"hello");
        Bundle bundle = new Bundle();
        User user = new User();
        user.setFirstname("John");

        bundle.putParcelable("user", Parcels.wrap(user));
        intent.putExtra(MESSAGE, bundle);

        startActivity(intent);
    }
}
