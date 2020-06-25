package com.example.neino.locateme;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Message extends AppCompatActivity {

    private EditText phone;
    private EditText message;
    private Button envoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        initActivity();
    }

    private void  initActivity()
    {
        phone = (EditText)findViewById(R.id.txtPhone);
        message = (EditText)findViewById(R.id.txtMessage);
        envoi = (Button) findViewById(R.id.btnSend);
        createOnClickEnvoiButton();
    }
    private void createOnClickEnvoiButton(){
        envoi.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                SmsManager.getDefault().sendTextMessage(phone.getText().toString(), null,
                        message.getText().toString(), null, null );
            }


        });


    }
}