package de.willemer.startintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, GrussActivity.class);
        intent.putExtra("Nachricht", "Schöne Grüße von MainActivity!");
        intent.putExtra("Zahl", 42);
        intent.putExtra("Kreiszahl", 1.414);
        //Daten daten = new Daten();
        //intent.putExtra("daten", daten);
        startActivity(intent);
    }
}