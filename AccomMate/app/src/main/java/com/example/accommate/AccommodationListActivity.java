package com.example.accommate;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.accommate.databinding.ActivityAccommodationListBinding;

import java.util.ArrayList;
import java.util.List;

public class AccommodationListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AccommodationAdapter adapter;
    private List<String> accommodations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation_list);

        recyclerView = findViewById(R.id.recycler_view_accommodations);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize your data here
        accommodations = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            accommodations.add("Accommodation " + (i + 1));
        }

        adapter = new AccommodationAdapter(accommodations);
        recyclerView.setAdapter(adapter);
    }
}