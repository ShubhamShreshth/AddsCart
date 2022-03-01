package com.as2developers.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConfirmPickupActivity extends AppCompatActivity {

    LinearLayout linearLayout_back_process;
    EditText ed_note;
    TextView txt_Cancel, txt_itemPickup, txt_pickUpdate, txt_confirm, scarpItem_txt, change_scrap, chane_Adddress, change_pickup,
            txt_homeAddress, txt_Address, txt_pickupTime;
    View fragment_location;
    ImageButton image_back_process,back;
    Button continue_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pickup);
        //for back
        back = findViewById(R.id.back);

//        image_back_process = findViewById(R.id.back_process);
//        linearLayout_back_process = findViewById(R.id.layout_back_process);

//        txt_Cancel = findViewById(R.id.txt_cancel);
        txt_itemPickup = findViewById(R.id.text_itemPickup);
        txt_pickUpdate = findViewById(R.id.txt_pickupDate);
        txt_confirm = findViewById(R.id.txt_confirm);
        scarpItem_txt = findViewById(R.id.scarpitem_text);
//        change_scrap = findViewById(R.id.change_scrapItem);
//        change_pickup = findViewById(R.id.change_pickup);
//        chane_Adddress = findViewById(R.id.change_address);
        txt_homeAddress = findViewById(R.id.txt_homeAddress);
        txt_Address = findViewById(R.id.txt_Address);
        txt_pickupTime = findViewById(R.id.txt_pichup_time);

        fragment_location = findViewById(R.id.location_fragment);
//        ed_note = findViewById(R.id.ed_note);
        continue_btn = findViewById(R.id.btn_proceed);

        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfirmPickupActivity.this,DonateOrGetActivity.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}