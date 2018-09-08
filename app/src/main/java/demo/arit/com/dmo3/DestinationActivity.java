package demo.arit.com.dmo3;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;
import demo.arit.com.dmo3.model.User;

public class DestinationActivity extends AppCompatActivity {

    @BindView(R.id.tvMessage)
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        ButterKnife.bind(this);

//        String message = getIntent().getStringExtra(MainActivity.MESSAGE);

        Parcelable parcelable = getIntent().getParcelableExtra(MainActivity.MESSAGE);
        Bundle bundle = Parcels.unwrap()
        User user = Parcels.unwrap(parcelable);

//        tvMessage.setText(message);
        tvMessage.setText(user.getFirstname());

    }
}
