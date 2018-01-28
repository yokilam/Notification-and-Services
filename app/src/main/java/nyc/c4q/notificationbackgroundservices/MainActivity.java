package nyc.c4q.notificationbackgroundservices;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //setting a notificaiton ID allows you to update the notificaiton later on.
    //Just update the notificaiton instead of creating new one and have a stack of it.
    private static final int NOTIFICATION_ID = 555;
    private static final String NOTIFICATION_CHANNEL = "C4Q Notifications";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this, SecondActivity.class);
//        int requestID = (int) System.currentTimeMillis(); // Unique requestID to differentiate between various notification with same notification ID
//        int flags = PendingIntent.FLAG_CANCEL_CURRENT; // Cancel old intent and create new one
//
//        PendingIntent contentIntent = PendingIntent.getActivity(this, requestID,
//                intent, flags);
//
////        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
////                new Intent(this, SecondActivity.class), 0);
//
//        //parameter(Context, ChannelID)
//        //Builder method, building an object and return a Notification when we .build
//        NotificationCompat.Builder notification = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL)
//                .setSmallIcon(R.drawable.notification_icon)
//                .setContentTitle("You have a notification")
//                .setContentText("You have 13 messages!")
//                .setContentIntent(contentIntent)
//                .setAutoCancel(true);
//
//        //set the notification at the top instead of the service bar.
////        .setDefaults(Notification.DEFAULT_ALL) .setPriority(NotificationManager.IMPORTANCE_HIGH)
//
//
//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.notify(NOTIFICATION_ID, notification.build());

        //-----Passing data------
        // Intent intent = new Intent(this, MyActivity.class);
//        intent.setData(data);
//        intent.putExtra("key", "value");
//        final PendingIntent contentIntent = PendingIntent.getActivity(this, 0, intent, 0);

///-----------------------SERVICE----------------------------------
//        Intent i = new Intent(this, MyNotificationService.class);
//        startService(i);

    }
}
