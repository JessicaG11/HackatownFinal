package com.hackatown.mades.authentification;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public String nom;

    private Button voirPatinoire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        voirPatinoire = (Button) findViewById(R.id.boutonDetails);
        voirPatinoire.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "die", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng poly = new LatLng(45.504384,  -73.612883);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(poly, 12));

        LatLng pat1 = new LatLng(45.468366,   -73.607168);
        mMap.addMarker(new MarkerOptions().position(pat1).title("Parc Georges-Saint-Pierre"));
        LatLng pat2 = new LatLng(45.466236,  -73.6508);
        mMap.addMarker(new MarkerOptions().position(pat2).title("Parc Gilbert-Layton"));
        LatLng pat3 = new LatLng(45.497066,  -73.619794);
        mMap.addMarker(new MarkerOptions().position(pat3).title("Parc Jean-Brillant"));
        LatLng pat4 = new LatLng(45.502208 ,   -73.633337);
        mMap.addMarker(new MarkerOptions().position(pat4).title("Parc Kent"));
        LatLng pat5 = new LatLng(45.462948,  -73.646101);
        mMap.addMarker(new MarkerOptions().position(pat5).title("Parc Loyola"));
        LatLng pat6 = new LatLng(45.483356,  -73.635142);
        mMap.addMarker(new MarkerOptions().position(pat6).title("Parc MacDonald"));
        LatLng pat7 = new LatLng(45.490016,  -73.633576);
        mMap.addMarker(new MarkerOptions().position(pat7).title("Parc Mackenzie-King"));
        LatLng pat8 = new LatLng(45.483714,  -73.62009);
        mMap.addMarker(new MarkerOptions().position(pat8).title("Parc Maurice-Cullen"));
        LatLng pat9 = new LatLng(45.47281,  -73.614321);
        mMap.addMarker(new MarkerOptions().position(pat9).title("Parc Notre-Dame-de-Grâce"));
        LatLng pat10 = new LatLng( 45.491549,  -73.638829);
        mMap.addMarker(new MarkerOptions().position(pat10).title("Parc Van Horne"));
        LatLng pat11 = new LatLng( 45.469923,   -73.631122);
        mMap.addMarker(new MarkerOptions().position(pat11).title("Parc William-Hurst"));
        LatLng pat12 = new LatLng( 45.422601, -73.647841);
        mMap.addMarker(new MarkerOptions().position(pat12).title("Parc Hayward"));
        LatLng pat13 = new LatLng( 45.420949, -73.611255);
        mMap.addMarker(new MarkerOptions().position(pat13).title("Parc Riverside"));
        LatLng pat14 = new LatLng( 45.487538, -73.883768);
        mMap.addMarker(new MarkerOptions().position(pat14).title("Parc Eugène-Dostie"));
        LatLng pat15 = new LatLng( 45.604124, -73.584198);
        mMap.addMarker(new MarkerOptions().position(pat15).title("Parc Lucie-Bruneau"));
        LatLng pat16 = new LatLng( 45.607129, -73.559956);
        mMap.addMarker(new MarkerOptions().position(pat16).title("Parc de Talcy"));
        LatLng pat17 = new LatLng( 45.526364, -73.569345);
        mMap.addMarker(new MarkerOptions().position(pat17).title("Parc La Fontaine"));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean  onMarkerClick(Marker marker) {
                marker.showInfoWindow();
                nom = marker.getTitle();
                return true;
            }
        });
    }
}
