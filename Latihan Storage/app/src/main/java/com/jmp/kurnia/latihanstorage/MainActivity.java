package com.jmp.kurnia.latihanstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String keyInternal = "KEY_INTERNAL_STORAGE";
    private String keyExternal = "KEY_EXTERNAL_STORAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionInternalStorage(View view) {
        Intent internal = new Intent(this, InternalStorageActivity.class);
        internal.putExtra(keyInternal, "Internal Storage");
        startActivity(internal);
    }

    public void actionExternalStorage(View view) {
        Intent external = new Intent(this, ExternalStorageActivity.class);
        external.putExtra(keyExternal, "External Storage");
        startActivity(external);
    }
}