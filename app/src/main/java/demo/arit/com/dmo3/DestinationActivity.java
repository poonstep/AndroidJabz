package demo.arit.com.dmo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DestinationActivity extends AppCompatActivity {

    @BindView(R.id.tvMessage)
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        ButterKnife.bind(this);

        String message = getIntent().getStringExtra(MainActivity.MESSAGE);
        tvMessage.setText(message);

    }
}
