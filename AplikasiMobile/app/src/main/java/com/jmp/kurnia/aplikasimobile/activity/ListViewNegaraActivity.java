package com.jmp.kurnia.aplikasimobile.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.jmp.kurnia.aplikasimobile.R;

public class ListViewNegaraActivity extends AppCompatActivity {

    private ListView listViewNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_negara);
        getSupportActionBar().setTitle("List View Negara");

        String [] countryArray = new String[]{
                "Indonesia", "Malaysia", "Brunei", "Thailand", "Jepang",
                "Jerman", "Inggris", "Austria", "Amerika", "Irak", "India"
        };

        listViewNegara = findViewById(R.id.lv_negara);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                countryArray);
        listViewNegara.setAdapter(adapter);
        listViewNegara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), countryArray[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}