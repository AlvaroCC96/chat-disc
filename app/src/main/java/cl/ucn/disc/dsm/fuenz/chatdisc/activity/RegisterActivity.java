/*
 * Copyright (c) 2020. This code is purely educational, the rights of use are
 *  reserved, the owner of the code is Ignacio Fuenzalida Veas
 *  contact ignacio.fuenzalida@alumnos.ucn.cl
 *  Do not use in production.
 */

package cl.ucn.disc.dsm.fuenz.chatdisc.activity;

import androidx.appcompat.app.AppCompatActivity;
import cl.ucn.disc.dsm.fuenz.chatdisc.R;
import es.dmoral.toasty.Toasty;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {

    EditText editTextEmail, editTextPassword, editTextUsername;
    Button btnRegister, btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        /*
        Email container
         */
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        /*
        Username container
         */
        editTextUsername = findViewById(R.id.editTextTextPersonName);
        /*
        Password container
         */
        editTextPassword = findViewById(R.id.editTextTextPassword);

        /*
        Button who will send a post to create a new user
         */
        btnRegister = findViewById(R.id.button);

        btnReturn = findViewById(R.id.btnReturn);

        btnRegister.setOnClickListener(view -> {


            String email = editTextEmail.getText().toString();
            String username = editTextUsername.getText().toString();
            String password = editTextUsername.getText().toString();

            if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(username)  ){
                Toasty.error(this,"Please fill all fields correctly",Toast.LENGTH_SHORT,false).show();
                return;
            }

            // TODO: Llamar al RefisterHandler

            Toasty.success(this,"You have successfully registered",Toast.LENGTH_SHORT,true).show();

        });

        btnReturn.setOnClickListener(view -> {
            Intent intent = new Intent(this,LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

        });
    }
}