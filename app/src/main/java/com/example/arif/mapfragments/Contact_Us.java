package com.example.arif.mapfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.MapFragment;

public class Contact_Us extends AppCompatActivity {

    MAPFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__us);

        getSupportFragmentManager().beginTransaction().add(R.id.FragMap, new MAPFragment()).commit();
    }
}
