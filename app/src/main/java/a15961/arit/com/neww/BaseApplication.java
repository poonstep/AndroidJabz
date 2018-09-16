package a15961.arit.com.neww;

import android.app.Application;
import android.content.SharedPreferences;

import a15961.arit.com.neww.model.User;
import io.realm.Realm;
import io.realm.RealmAsyncTask;
import io.realm.RealmConfiguration;

public class BaseApplication extends Application {

    private RealmAsyncTask task;

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferences pref = getSharedPreferences("settings",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("display-name","John Doe");
        editor.putBoolean("safemode",true);

        editor.apply();

        Realm.init(this);
//        RealmConfiguration config = new RealmConfiguration.Builder();

        Realm realm = Realm.getDefaultInstance();
//        realm.createObject(User.class); // Managed

        final User user = new User();   // Unmanaged Object
        user.setFirstname("John");
        user.setLastname("Doe");

        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insert(user);
            }
        });

        // do something when finish task
        task = realm.executeTransactionAsync(new Realm.Transaction() {
                                          @Override
                                          public void execute(Realm realm) {

                                          }
                                      }, new Realm.Transaction.OnSuccess() {
                                          @Override
                                          public void onSuccess() {
                                              // do something when finish task
                                          }
                                      }, new Realm.Transaction.OnError() {
                                          @Override
                                          public void onError(Throwable error) {

                                          }
                                      }
        );

    }
    @Override
    public void onTerminate() {
        super.onTerminate();
        Realm.getDefaultInstance().close();
        this.task.cancel();
    }
}
