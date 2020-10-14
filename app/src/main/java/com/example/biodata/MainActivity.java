package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void dosomething(View view){
        switch(view.getId())
        {
            case R.id.alamat:
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/place/Jl.+Raya+Karanganyar+Tirto,+Pekalongan,+Jawa+Tengah/@-6.9139032,109.6293087,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7026c47b230c79:0x71c068cfb5acf2b6!8m2!3d-6.9139085!4d109.6315027"));
                startActivity(intent);
                break;
            case R.id.notelp:
                Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:082322556631"));
                startActivity(intent2);
                break;
            case R.id.email:
                Intent intent3 = new Intent(Intent.ACTION_SEND);
                intent3.setType("plain/text");
                intent3.putExtra(Intent.EXTRA_EMAIL, new String[] { "111201811445@mhs.dinus.ac.id" });
                intent3.putExtra(Intent.EXTRA_SUBJECT, "this subject");
                intent3.putExtra(Intent.EXTRA_TEXT, "this mail body");
                startActivity(Intent.createChooser(intent3, "Email me :)"));
                break;

        }
    }
}