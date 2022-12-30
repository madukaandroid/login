package com.example.easybilling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.etname);
        TextView password = (TextView) findViewById(R.id.etPassword);
        Button loginbtn = (Button) findViewById(R.id.btnlogin);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Admin") && password.getText().toString().equals("12345")) {
                    Toast.makeText(MainActivity.this, "Loging successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "Please enter all the details correctly", Toast.LENGTH_SHORT).show();

                }


            }

        });

    }



   /* private EditText eUsername;
    private EditText ePassword;
    private Button eLogin;
   //private TextView eAttemptsInfo;

   // boolean isValid = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eUsername = findViewById(R.id.etname);
        ePassword= findViewById(R.id.etPassword);
        eLogin= findViewById(R.id.btnlogin);



        eLogin.setOnClickListener(view -> {
            String inputUserName = eUsername.getText().toString();
            String inputPassword = ePassword.getText().toString();

            if(inputUserName.isEmpty()||inputPassword.isEmpty())
            {
                Toast.makeText(MainActivity.this,"Please enter all the details correctly",Toast.LENGTH_SHORT).show();
            }

                else{

                    Toast.makeText(MainActivity.this,"Loging successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent( MainActivity.this,MainActivity2.class);
                    startActivity(intent);



                }





        });



    }
   /* private boolean validate(String userName,String password){
        String userName1 = "Admin";
        String password1 = "123456";
        return userName.equals(userName1) && password.equals(password1);
    }*/

}
