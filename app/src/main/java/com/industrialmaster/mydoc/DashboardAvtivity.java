package com.industrialmaster.mydoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class DashboardAvtivity extends AppCompatActivity {
    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.TYPE_INPUT_METHOD_DIALOG);
        setContentView(R.layout.activity_dashboard_avtivity);

        cardView=(CardView) findViewById(R.id.btnDoctor);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctor();
            }
        });

        cardView=(CardView) findViewById(R.id.btnHospital);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHospital();
            }
        });

        cardView=(CardView) findViewById(R.id.btnAppoinment);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppoinment();
            }
        });

        cardView=(CardView) findViewById(R.id.btnSpecial);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpecial();
            }
        });

        cardView=(CardView) findViewById(R.id.btnProfiles2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile22();
            }
        });


    }

    public void openDoctor(){
        Intent intent = new Intent(this, DoctorActivity.class);
        startActivity(intent);
    }

    public void openHospital(){
        Intent intent = new Intent(this, HospitalActivity.class);
        startActivity(intent);
    }

    public void openAppoinment(){
        Intent intent = new Intent(this, AppoinmentActivity.class);
        startActivity(intent);
    }

    public void openSpecial(){
        Intent intent = new Intent(this, SpecialActivity.class);
        startActivity(intent);
    }

    public void openProfile22(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

}

