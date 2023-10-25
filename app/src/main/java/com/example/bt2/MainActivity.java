package com.example.bt2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editFirstname;
    private EditText editLastname;
    private EditText editTextEmail;
    private CheckBox editcheckBox;
    private EditText editTextAddress;
    private EditText editBirthday;
    private RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFirstname = findViewById(R.id.editFirstname);
        editLastname = findViewById(R.id.editLastname);
        editTextEmail = findViewById(R.id.editTextEmail);
        editcheckBox = findViewById(R.id.editcheckBox);
        editTextAddress = findViewById(R.id.editTextAddress);
        editBirthday = findViewById(R.id.editBirthday);
        rgGender = findViewById(R.id.rgGender);

        Button registerButton = findViewById(R.id.btRegister);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editFirstname.getText().toString();
                String lastName = editLastname.getText().toString();
                String email = editTextEmail.getText().toString();
                boolean isCheckBoxChecked = editcheckBox.isChecked();
                String address = editTextAddress.getText().toString();
                String birthDate = editBirthday.getText().toString();
                int selectedGenderId = rgGender.getCheckedRadioButtonId();

                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || address.isEmpty() || birthDate.isEmpty() || selectedGenderId == -1 || !isCheckBoxChecked) {
                    Toast.makeText(getApplicationContext(), "Vui lòng nhập đủ thông tin và đồng ý với điều khoản sử dụng.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Thông tin đã được lưu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}