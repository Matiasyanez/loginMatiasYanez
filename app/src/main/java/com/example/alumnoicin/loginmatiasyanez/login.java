package com.example.alumnoicin.loginmatiasyanez;

import android.view.View;
import android.widget.EditText;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

/**
 * Created by Alumno ICIN on 30-08-2018.
 */

public class login extends MainActivity {
    public static AtomicInteger AlumnoRut = new AtomicInteger();

    public void onCreate(){
        super.onCreate();
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration()
                .builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
        Realm realm = Realm.getInstance(config);
        AlumnoRut = setAtomicId(realm, Alumno.class);

        realm.close();
    }

    private AtomicInteger setAtomicId(Realm realm, Class<Alumno> alumnoClass) {
        RealmResults results = realm.where(anyClass).findAll();
        return (results.size() > 0) ? new AtomicInteger(results.max("Rut").intValue()) : new AtomicInteger();
    }

}
