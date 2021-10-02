package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    Button showbtn;
    private Button hidebtn;
    private BottomSheetBehavior bottomSheetBehavior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        showbtn = findViewById(R.id.showbtn);
        hidebtn = findViewById(R.id.hidebtn);


        LinearLayout bottomsheetlayout = findViewById(R.id.bottomsheetl);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetlayout);

        bottomSheetBehavior.setPeekHeight(320);

        bottomSheetBehavior.setHideable(false);

        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomsheetlayout.setVisibility(View.VISIBLE);

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HALF_EXPANDED);


            }
        });

        hidebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                bottomsheetlayout.setVisibility(View.INVISIBLE);

            }
        });


    }
}