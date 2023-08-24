package com.example.latihanstechoq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText editName, editEmail, editPassword, editPasswordConf, editUsername;
    private Button btnRegister;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editEmail = findViewById(R.id.email);
        editPassword = findViewById(R.id.password);
        editName = findViewById(R.id.name);
        editPasswordConf = findViewById(R.id.password_conf);
        editUsername = findViewById(R.id.username);
        btnRegister = findViewById(R.id.btn_register);

        progressDialog = new ProgressDialog(Register.this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Tunggu sebentar");
        progressDialog.setCancelable(false);

        btnRegister.setOnClickListener(v -> {
            if(editEmail.getText().length()>0 && editUsername.getText().length()>0 && editPassword.getText().length()>0 && editName.getText().length()>0 && editPasswordConf.getText().length()>0){
                Toast.makeText(getApplicationContext(), "Register berhasil, namun user tidak tersimpan", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
            Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();

        });
    }
}