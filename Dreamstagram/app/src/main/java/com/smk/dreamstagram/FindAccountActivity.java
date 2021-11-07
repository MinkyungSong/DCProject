package com.smk.dreamstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FindAccountActivity extends AppCompatActivity {

    EditText etId_findAccount;
    Button btnNext_findAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_account);

        etId_findAccount = findViewById(R.id.etId_findAccount);
        btnNext_findAccount = findViewById(R.id.btnNext_findAccount);

        btnNext_findAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FindAccountActivity.this, "다음 버튼 클릭됨!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}