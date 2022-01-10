package com.gmail.mateendev3.orderedbroadcastsender.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DefaultBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            int initialCode = getResultCode();
            String initialData = getResultData();
            Bundle bundle = getResultExtras(true);
            String order = bundle.getString("order");

            initialCode++;
            order += "-> SenderOne";

            String output = "Initial Code: " + initialCode + "\n"
                    + "Initial Data: " + initialData + "\n"
                    + "Initial Order" + order;

            Toast.makeText(context, output, Toast.LENGTH_SHORT).show();
    }
}
