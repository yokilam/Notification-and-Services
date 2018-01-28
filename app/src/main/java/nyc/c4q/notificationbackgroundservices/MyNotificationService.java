package nyc.c4q.notificationbackgroundservices;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

/**
 * Created by yokilam on 1/28/18.
 */

public class MyNotificationService extends IntentService {

    private static final String SERVICE_NAME= "notification-service";
    private static final int NOTIFICATION_ID = 555;
    private static final String NOTIFICATION_CHANNEL = "C4Q Notifications";

    public MyNotificationService() {
        super(SERVICE_NAME);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Intent notificationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));

        int requestID = (int) System.currentTimeMillis(); // Unique requestID to differentiate between various notification with same notification ID
        int flags = PendingIntent.FLAG_CANCEL_CURRENT; // Cancel old intent and create new one

        PendingIntent contentIntent = PendingIntent.getActivity(this, requestID,
                notificationIntent, flags);

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("You have a notification")
                .setContentText("You have 13 messages!")
                .setContentIntent(contentIntent)
                .setAutoCancel(true);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, notification.build());
    }
}
