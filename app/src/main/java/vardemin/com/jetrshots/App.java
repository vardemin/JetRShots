package vardemin.com.jetrshots;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by xavie on 12.02.2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Context.getFilesDir() --> "default.realm"
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();

        Realm.setDefaultConfiguration(config);
    }
}
