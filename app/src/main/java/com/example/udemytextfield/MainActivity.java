package com.example.udemytextfield;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText pass;
    TextInputLayout userLayout;
    TextInputLayout passLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.username_TextField);
        userLayout = findViewById(R.id.username_TextInputLayout);

        pass = findViewById(R.id.password_TextField);
        passLayout = findViewById(R.id.password_TextInputLayout);

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (user.getText().toString().isEmpty()){

                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username!");

                }else {
                    userLayout.setErrorEnabled(false);

                }
            }
        });

        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (user.getText().toString().isEmpty()){

                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username!");

                }else {
                    userLayout.setErrorEnabled(false);

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        passLayout.setCounterEnabled(true);
        passLayout.setCounterMaxLength(10);

//        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//
//            }
//        });



//        user.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });

    }//The last method onCreate
}//The last class
