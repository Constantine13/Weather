package com.example.weather_application;

import android.content.Intent;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

public class MarkerClickListener implements GoogleMap.OnMarkerClickListener {

    @Override
    public boolean onMarkerClick(Marker marker) {
        LatLng position = marker.getPosition();
        Intent weatherIntent = new Intent();
        weatherIntent.putExtra("position",position);
        return false;
    }
}
