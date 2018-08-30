package com.example.alumnoicin.loginmatiasyanez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private MyAdapter adapter;
    private Realm realm;
    private RealmResults<Alumno> Alumno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();
        listView = (ListView) findViewById(R.id.listView);

        Alumno = getAllAlumno();
        Alumno.addChangeListener((RealmChangeListener<RealmResults<com.example.alumnoicin.loginmatiasyanez.Alumno>>) this);
        adapter = new MyAdapter(Alumno, R.layout.list_item_view, this);

        listView.setAdapter(adapter);
    }

    public void onChange(RealmResults<Alumno> element) {
        adapter.notifyDataSetChanged();
    }


    protected void onDestroy() {
        realm.removeAllChangeListeners();
        realm.close();
        super.onDestroy();
    }

    private RealmResults<Alumno> getAllAlumno() {
        return realm.where(Alumno.class).findAll();
    }

    private void removeAll() {
        realm.beginTransaction();
        realm.deleteAll();
        realm.commitTransaction();
    }


    private void addAlumno() {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                Alumno a1 = new Alumno(12345678, "Matias", 25, "ASdad", 2525252, "gasd");
                Alumno a2 = new Alumno(12435233, "Fernando", 24, "ASdadfffas", 25244452, "gasda");
                Alumno a3 = new Alumno(64742344, "Matias", 20, "ASdadasdad", 14551, "gasdads");

                realm.copyToRealmOrUpdate(a1);
                realm.copyToRealmOrUpdate(a2);
                realm.copyToRealmOrUpdate(a3);

                Alumno = getAllAlumno();
            }
        });
    }

}
