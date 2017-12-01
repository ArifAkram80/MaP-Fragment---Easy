package com.example.arif.mapfragments;




import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;




/**
 * A simple {@link Fragment} subclass.
 */
public class MAPFragment extends Fragment implements OnMapReadyCallback {

    private static final String TAG = "MAP";
    GoogleMap mMap;
    SupportMapFragment mapFragment;


    public MAPFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ma, container, false);

        mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.MyMapID);
        if (mapFragment == null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            mapFragment = SupportMapFragment.newInstance();
            fragmentTransaction.replace(R.id.MyMapID, mapFragment).commit();
        }
        mapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Log.i(TAG, "ON MAP");

        // 24.89721,91.8654227
        LatLng Metro_UniV = new LatLng(24.89721, 91.8654227);
        mMap.addMarker(new MarkerOptions().position(Metro_UniV).title("Metropolitan University"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Metro_UniV, 17));
    }


}
