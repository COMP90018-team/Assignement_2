package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DiceGameActivity extends AppCompatActivity {
    String selectParameter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_game);

        TextView showNumDices = (TextView) findViewById(R.id.text_num_dice);
        selectParameter = getIntent().getStringExtra("selectParameter");
        showNumDices.setText("Playing with " + selectParameter + " Dices");

        TextView showContent = (TextView) findViewById(R.id.dicecup_img);
        Button btnOpen = (Button) findViewById(R.id.open_btn);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showContent.setText(R.string.test_text_2);
            }
        });

        Button btnShake = (Button) findViewById(R.id.shake_btn);
        btnShake.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showContent.setText(R.string.test_text_3);
            }
        });

        Button btnBack = (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}