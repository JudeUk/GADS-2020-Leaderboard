package com.example.gadsleaderboard2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SumbitPost extends AppCompatActivity {

    EditText editTextFirstName,editTextLastName,editTextEmail,editTextGitHubLink;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumbit);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextGitHubLink = findViewById(R.id.editTextGitHubLink);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitToGithub();
            }
        });




    }

    private void submitToGithub() {




    }
}
