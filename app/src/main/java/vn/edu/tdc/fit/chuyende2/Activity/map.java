package vn.edu.tdc.fit.chuyende2.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import vn.edu.tdc.fit.chuyende2.R;

public class map extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap map;
    PlaceAutocompleteFragment placeAutoComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Map");
        setSupportActionBar(toolbar);


        //Ánh xạ map
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.myMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        //Tọa độ, kinh độ, vĩ độ
        LatLng latLng = new LatLng(10.8595939, 106.7610836);
        //Hiển thị vị trị của mình
        //Quan sát camera
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 17));
        map.addMarker(new MarkerOptions()
                .title("Công ty")
                .snippet("Trách nhiệm hữu hạn một thành viên")
                .position(latLng)
        );
        LatLng lng = new LatLng(10.857582, 106.756580);
        map.addPolyline(new PolylineOptions().add(
                latLng,
                new LatLng(10.858002, 106.758358),
                new LatLng(10.857716, 106.757447),
                lng
                )
                        .width(10)
                        .color(Color.RED)
        );
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        map.setMyLocationEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu item) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.map, item);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.line1:
                map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                break;
            case R.id.line2:
                map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                break;
            case R.id.line3:
                map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                break;
            case R.id.line4:
                map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                break;
            case R.id.line5:
                map.setMapType(GoogleMap.MAP_TYPE_NONE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}