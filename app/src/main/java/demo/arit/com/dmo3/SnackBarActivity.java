package demo.arit.com.dmo3;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SnackBarActivity extends AppCompatActivity {

    @BindView(R.id.layout)
    CoordinatorLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnShowSnackbar)
    public void showSnackbar(){
        Snackbar snackbar = Snackbar.make(layout,"Show more message",Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
