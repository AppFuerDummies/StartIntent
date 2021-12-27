package de.willemer.startintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GrussActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruss);
        Intent intent = getIntent();
        String gruss = intent.getStringExtra("Nachricht");
        int zahl = intent.getIntExtra("Zahl", 0);
        double pi = intent.getDoubleExtra("Kreiszahl", 0.0);
        //Daten daten = (Daten) intent.getSerializableExtra("daten");
        //boolean wahr = intent.getBooleanExtra("wirklich", true);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(""+ pi);
        Button bt = (Button) findViewById(R.id.btphone);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0555 555-555"));
                startActivity(intent);
            }
        });
        Button btsurf = (Button) findViewById(R.id.btsurf);
        btsurf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://willemer.de/informatik"));
                startActivity(intent);
            }
        });
    }
}