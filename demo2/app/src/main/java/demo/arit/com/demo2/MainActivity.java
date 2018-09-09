package demo.arit.com.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    public static final String MESSAGE = "MESSAGE";
    //@BindView(R.id.tvMessage) TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //String message = getIntent().getStringExtra(MESSAGE);
        //tvMessage.setText(message);
    }

    @OnClick(R.id.button)
    public void sendMessage(){
        Intent intent = new Intent();
        intent.setClass(this,DestinationActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        intent.putExtra(MESSAGE,"hello");
        startActivity(intent);
//        finish();
    }

}
