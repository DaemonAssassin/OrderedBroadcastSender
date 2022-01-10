package com.gmail.mateendev3.orderedbroadcastsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gmail.mateendev3.orderedbroadcastsender.receivers.DefaultBroadcastReceiver;

public class MainActivity extends AppCompatActivity {
    DefaultBroadcastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_send_broadcast)
                .setOnClickListener(v -> {

                    mReceiver = new DefaultBroadcastReceiver();

                    Bundle bundle = new Bundle();
                    bundle.putString("order", "Order");

                    Intent intent = new Intent("PakistanZindabad");

                    sendOrderedBroadcast(
                            intent,
                            null,
                            mReceiver,
                            null,
                            RESULT_OK,
                            "Pak",
                            bundle
                    );
                });
    }
}