package com.example.portfolio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        EditText editMessage = findViewById(R.id.editMessage);
        Button btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(view -> {
            String message = editMessage.getText().toString().trim();

            if (message.isEmpty()) {
                Toast.makeText(ContactActivity.this,
                        "Please enter a message",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ContactActivity.this,
                        "Message sent",
                        Toast.LENGTH_SHORT).show();
                editMessage.setText("");
            }
        });
    }
}