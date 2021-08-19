package com.jmp.kurnia.catatanharian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class InsertAndViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_and_view);

        setTitle("Catatan Baru");
    }

    public void actionSumbitNote(View view) {
        // Menyimpan File
    }
}