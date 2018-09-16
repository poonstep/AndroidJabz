package a15961.arit.com.neww;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Observable;

import a15961.arit.com.neww.model.User;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvShowPref)
    TextView tvShowPreference;

    private String displayname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }


    @OnClick(R.id.btnGetPref)
    public void showPref(){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("settings",MODE_PRIVATE);
        this.displayname = pref.getString("display-name",null);

        this.tvShowPreference.setText(displayname);
    }

    @OnClick(R.id.btnGetRealmData)
    public  void showRealmData(){
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                User user = realm.where(User.class).findFirst();

//                Observable<RealmResults<User>> users = realm.where(User.class).findAll();

                tvShowPreference.setText(user.getFirstname());
            }
        });
    }
}
