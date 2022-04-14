package com.best.a72j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout textInputLayout1;
    TextInputLayout textInputLayout2;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.edit1);
        editText2 = findViewById(R.id.edit2);
        textInputLayout1 = findViewById(R.id.textIn1);
        textInputLayout2 = findViewById(R.id.textIn2);
        open();
        openDetail();
    }

    public void open() {
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > textInputLayout1.getCounterMaxLength()) {
                    textInputLayout1.setError("At least " + textInputLayout1.getCounterMaxLength());
                }
            }
        });
    }

    public void openDetail() {
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() > textInputLayout2.getCounterMaxLength()) {
                    textInputLayout2.setError("At least " + textInputLayout2.getCounterMaxLength());
                }
            }
        });
    }
}