package com.hackatown.mades.authentification;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class parametre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametre);

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
                Toast.makeText(parametre.this, "Ouverture des paramètres", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, parametre.class));
                return true;

            case R.id.control:
                Toast.makeText(parametre.this, "Ouverture du menu", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, menu.class));
                return true;


            default: return super.onOptionsItemSelected(item);
        }
    }
}
