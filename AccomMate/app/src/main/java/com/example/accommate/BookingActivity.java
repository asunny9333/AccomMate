package com.example.accommate;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.accommate.databinding.ActivityBookingBinding;

public class BookingActivity extends AppCompatActivity {

    private ActivityBookingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Retrieve and display booking details
        String searchQuery = getIntent().getStringExtra("SEARCH_QUERY");
        if (searchQuery != null) {
            binding.bookingDetailsTextView.setText("Details for: " + searchQuery);
        }

        binding.confirmBookingButton.setOnClickListener(v -> {
            // Handle booking confirmation
        });
    }
}