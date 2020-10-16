package com.example.hamarkisaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button diseasebutton;
    private Button gpslocation;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*diseasebutton=findViewById(R.id.disease);
        diseasebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.android.chrome");
                startActivity(i);
            }
        });*/
        gpslocation=(Button) findViewById(R.id.location);
        gpslocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION}, PackageManager.PERMISSION_GRANTED);

    }
    public void openMapsActivity() {
        Intent intent5 = new Intent(this, MapsActivity.class);
        startActivity(intent5);
    }


       /* public void openclassifier(View view){
            Intent disease= getPackageManager().getLaunchIntentForPackage("com.android.chrome");
            startActivity(disease);
        }*/

    public void gmailButton(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("org.tensorflow.lite.examples.classification");
        //org.tensorflow.lite.examples.classification
        if (intent != null) {
            startActivity(intent);
        }
    }

    public void plantcamerabutton(View view) {
        Intent intent1 = getPackageManager().getLaunchIntentForPackage("com.iiitnayaraipur.plantcameraiiit");
        //org.tensorflow.lite.examples.classification
        if (intent1 != null) {
            startActivity(intent1);
        }
    }

    public void npkbutton(View view) {
        Intent intent2 = getPackageManager().getLaunchIntentForPackage("com.example.spoctoiotkrishinetwork");
        //org.tensorflow.lite.examples.classification
        if (intent2 != null) {
            startActivity(intent2);
        }
    }
    public void sendlocation(View view) {
        Intent intent1 = getPackageManager().getLaunchIntentForPackage("com.iiitnayaraipur.plantcameraiiit");
        //org.tensorflow.lite.examples.classification
        if (intent1 != null) {
            startActivity(intent1);
        }
    }

}