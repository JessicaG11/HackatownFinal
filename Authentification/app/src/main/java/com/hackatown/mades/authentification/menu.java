package com.hackatown.mades.authentification;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu extends AppCompatActivity {


    public Button bouton;
    public Button bouton2;
    public Button bouton3;

    public void init(){
        bouton = (Button)findViewById(R.id.organiser2);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent action = new Intent(menu.this, Main3Activity.class);

                startActivity(action);
            }
        });

    }

    public void init2() {
        bouton2 = (Button)findViewById(R.id.trouver2);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent action = new Intent(menu.this, Map.class);

                startActivity(action);
            }
        });

    }

    public void init3() {
        bouton3 = (Button)findViewById(R.id.principal);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent action = new Intent(menu.this, Main2Activity.class);

                startActivity(action);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
        init2();
        init3();

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar allo = getSupportActionBar();
        allo.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.parametre:
                Toast.makeText(menu.this, "Ouverture des paramètres", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, parametre.class));
                return true;

            case R.id.control:
                Toast.makeText(menu.this, "Ouverture du menu", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, menu.class));
                return true;


            default: return super.onOptionsItemSelected(item);
        }
    }
}
