package com.courses.vlad.lesson3_maskaikin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewExitAccount;
    private TextView textViewName;
    private TextView textViewSurname;
    private TextView textViewEmail;
    private TextView textViewLogin;
    private TextView textViewRegion;
    private TextView textViewProfil;
    private ImageButton imageButtonEditRegion;
    private Toolbar toolbar;
    private User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewName = findViewById(R.id.textViewName);
        textViewSurname = findViewById(R.id.textViewSurname);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewLogin = findViewById(R.id.textViewLogin);
        textViewRegion = findViewById(R.id.textViewRegion);
        textViewProfil = findViewById(R.id.textViewProfil);

        textViewExitAccount = findViewById(R.id.textViewExitAccount);
        imageButtonEditRegion = findViewById(R.id.imageButtonEditRegion);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        user = new User("Анастасия", "Антонина", "example@gmail.com", "Anastasia228",
                "Саранск", "12345678910", "Специалист");
        textViewName.setText(user.name);
        textViewSurname.setText(user.surname);
        textViewEmail.setText(user.email);
        textViewLogin.setText(user.login);
        textViewRegion.setText(user.region);
        textViewProfil.setText("Карта №" +user.numberCard + "\n"+user.status);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Пока пока!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                finish();
            }
        });

        final Toast toastMenu = Toast.makeText(MainActivity.this, "Вы нажали на меню!", Toast.LENGTH_SHORT);
        toastMenu.setGravity(Gravity.CENTER, 0, 0);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                toastMenu.show();
                return true;
            }
        });


        textViewExitAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewExitAccount.isPressed()) {
                    textViewExitAccount.setHighlightColor(Color.parseColor("#cc0000"));
                }
                Toast toast = Toast.makeText(MainActivity.this, "Вы вышли из аккаунта!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        imageButtonEditRegion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this, "Редактирование Вашего региона!", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.user_info_menu, menu);
        return true;
    }
}
