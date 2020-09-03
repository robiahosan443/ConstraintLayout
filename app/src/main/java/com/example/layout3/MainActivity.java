package com.example.layout3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bLogin;
    private TextView registerTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLogin=findViewById(R.id.buttonid);
       registerTextView=findViewById(R.id.registerTextViewId);

       registerTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.registerTextViewId){
            Intent intent= new Intent(MainActivity.this,Signup_Activity.class);
            startActivity(intent);
        }
    }
}