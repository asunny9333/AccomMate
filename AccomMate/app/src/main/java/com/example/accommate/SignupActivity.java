package com.example.accommate;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.accommate.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {


    private ActivitySignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonSignup.setOnClickListener(v -> {
            String username = binding.editTextUsername.getText().toString();
            String email = binding.editTextEmail.getText().toString();
            String password = binding.editTextPassword.getText().toString();
            // Perform signup operation
            if (performSignup(username, email, password)) {
                // If signup is successful, redirect to login
                finish(); // Close SignupActivity
            } else {
                // Show error
            }
        });
    }

    private boolean performSignup(String username, String email, String password) {
        // Implement actual signup logic (e.g., save user details to a database or API)
        return false; // Default to false for demonstration purposes
    }
}