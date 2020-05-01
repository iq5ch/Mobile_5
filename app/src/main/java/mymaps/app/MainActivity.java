package mymaps.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v) {
                Intent i = new Intent(MainActivity.this, mymap.class);
                startActivity(i);
            }
        });

    }

//    FusedLocationProviderClient fusedLocationProviderClient;
//    private static final int REQUEST_CODE = 101;
//    Location currentLocation;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
//        fetchLastLocation();
//    }
//
//    private void fetchLastLocation() {
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[]
//                    {Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_CODE);
//        }
//        Task<Location> task = fusedLocationProviderClient.getLastLocation();
//        task.addOnSuccessListener(new OnSuccessListener<Location>() {
//            @Override
//            public void onSuccess(Location location) {
//                if (location != null) {
//                    currentLocation = location;
//                    Toast.makeText(getApplicationContext(), currentLocation.getLatitude()
//                            +""+currentLocation.getLongitude(), Toast.LENGTH_SHORT).show();
//                    SupportMapFragment supportMapFragment = (SupportMapFragment)
//                            getSupportFragmentManager().findFragmentById(R.id.google_map);
//                    supportMapFragment.getMapAsync(MainActivity.this);
//                }
//            }
//        });
//    }
//
//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        LatLng latLng = new LatLng(currentLocation.getLatitude(), currentLocation.getLongitude());
//        MarkerOptions markerOptions = new MarkerOptions().position(latLng)
//                .title("You are here.");
//        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
//        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 5));
//        googleMap.addMarker(markerOptions);
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        switch (requestCode) {
//            case REQUEST_CODE:
//                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    fetchLastLocation();
//                }
//                break;
//        }
//    }
}
