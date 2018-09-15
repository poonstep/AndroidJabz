package a15961.arit.com.neww;

import android.app.Application;
import android.content.SharedPreferences;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferences pref = getSharedPreferences("settings",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("display-name","John Doe");
        editor.putBoolean("safemode",true);

        editor.apply();
    }
}
