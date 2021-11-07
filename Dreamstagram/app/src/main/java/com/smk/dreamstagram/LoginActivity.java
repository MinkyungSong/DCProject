package com.smk.dreamstagram;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    final String ID_ADMIN = "admin";
    final String PW_ADMIN = "admin1234";

    EditText etId, etPassword;
    Button btnLogin, btnFindAccount, btnJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etId = findViewById(R.id.etId);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnFindAccount = findViewById(R.id.btnFindAccount);
        btnJoin = findViewById(R.id.btnJoin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 아무것도 입력 안하면 버튼 비활성화 하는 방법?

                String tempId = etId.getText().toString();  // setOnClickListener 안에 있어야 인식
                String tempPassword = etPassword.getText().toString();  // setOnClickListener 안에 있어야 인식

                if(tempId.equals(ID_ADMIN)){
                    if(tempPassword.equals(PW_ADMIN)) {
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                        builder.setTitle("비밀번호 오류");
                        builder.setMessage("입력된 비밀번호가 올바르지 않습니다. 다시 시도하세요.");
                        builder.setNegativeButton("다시 시도", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        builder.setCancelable(false);   // 창 밖 터치시 종료 옵션, 디폴트 값이 true, false로 할 시 버튼을 누르지 않으면 종료가 안 됨
                        builder.show(); // show()를 해야 보임
                    }
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setTitle("잘못된 사용자 이름");
                    builder.setMessage("입력하신 사용자 이름을 사용하는 계정을 찾을 수 없습니다." +
                        " 사용자 이름을 확인하고 다시 시도하세요.");
                    builder.setNegativeButton("다시 시도", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    builder.setCancelable(false);   // 창 밖 터치시 종료 옵션
                    builder.show(); // show()를 해야 보임
                };

            }
        });

        btnFindAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, FindAccountActivity.class);
                startActivity(intent);
            }
        });

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, JoinActivity.class);
                startActivity(intent);
            }
        });


    }
}