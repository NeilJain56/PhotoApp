package com.example.photosapp03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.photosapp03.R.layout.album_view

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


class MainActivity : AppCompatActivity() {

    private ListView listView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(album_view)

        listView = findViewById(R.id.album_list);
    }
}
