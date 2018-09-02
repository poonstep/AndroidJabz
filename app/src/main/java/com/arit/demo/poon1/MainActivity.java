package com.arit.demo.poon1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvMessage)
    TextView tvMessage;

    @OnClick(R.id.btnHello)
    public void doClickHello(){
        this.tvMessage.setText("Hello you done good");
        this.tvMessage.setText(R.string.messageHello);
    }

    // test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // test
       // final TextView tvMessage = findViewById(R.id.tvMessage);

        ButterKnife.bind(this);


//        Button btnHello = (Button)findViewById(R.id.btnHello);
//        btnHello.setText("Hello John!");
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvMessage.setText("Hello Jodn Doe, This is a test message");
//
//            }
//        });
    }


}
