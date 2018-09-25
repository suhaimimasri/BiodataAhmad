package com.example.user.biodataahmad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void MainUrl(View v) {
        Uri uri = Uri.parse("http://www.utem.edu.my/");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void callNumber(View v) {
        Uri uri = Uri.parse("tel:601115496480");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void showMap(View v) {
        Uri uri = Uri.parse("geo:3.558090, 102.804167");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

}

