package com.example.alumnoicin.loginmatiasyanez;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Alumno ICIN on 30-08-2018.
 */

public class login extends MainActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new login(); // LLamo a la funcion para el logueo.
    }


    public void login() {

        Button Login = (Button) findViewById(R.id.btnlogin);
        Login.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText user=(EditText) findViewById(R.id.txtuser);
                String usuario = user.getText().toString();
                EditText pass=(EditText) findViewById(R.id.txtpass);
                String password = pass.getText().toString();
                String user_stored="123";
                String pass_stored="123";


                if (usuario.equals(user_stored) & password.equals(pass_stored)){

                    log_success=true;
                    findViewById(R.id.badLog).setVisibility(View.INVISIBLE);
                    change_activity();

                }

                else {
                    log_success=false;
                    findViewById(R.id.badLog).setVisibility(View.VISIBLE); // Hago visible el mensaje de        // error en el user or pass.

                }
            }

        });
    }

    public void change_activity () {
        Intent myIntent = new Intent(getApplicationContext(), LogIn.class);
        startActivity(myIntent); // Cambio de aplicación
    }




}
