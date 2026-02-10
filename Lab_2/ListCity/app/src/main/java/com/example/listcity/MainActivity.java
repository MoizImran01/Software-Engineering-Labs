package com.example.listcity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView cityList;
    ArrayAdapter<String> cityAdapter;
    ArrayList<String> dataList;
    EditText cityNameEditText;
    Button addButton;
    Button deleteButton;
    int selected_position =-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        cityList = findViewById(R.id.city_list);
        String[] cities = {"Lahore", "Karachi", "Islamabad", "Peshawar", "Quetta"};
        dataList = new ArrayList<>();
        dataList.addAll(Arrays.asList(cities));
        cityAdapter = new ArrayAdapter<>(this, R.layout.content, dataList);
        cityList.setAdapter(cityAdapter);
        addButton = findViewById(R.id.add_button);
        deleteButton = findViewById(R.id.delete_button);
        cityNameEditText = findViewById(R.id.city_name_edit_text);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String new_city = cityNameEditText.getText().toString();
                if(cityNameEditText.getVisibility()==View.VISIBLE && !new_city.isEmpty()){
                    dataList.add(new_city);
                    cityAdapter.notifyDataSetChanged();
                    cityNameEditText.setText("");
                    cityNameEditText.setVisibility(View.GONE);
                    addButton.setText("Add City");
                }
                else{
                    cityNameEditText.setVisibility(View.VISIBLE);
                    addButton.setText("Confirm");
                }
            }
        });

        cityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selected_position = position;

            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected_position!=-1 && selected_position<dataList.size()){
                    dataList.remove(selected_position);
                    cityAdapter.notifyDataSetChanged();
                    selected_position=-1;
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}