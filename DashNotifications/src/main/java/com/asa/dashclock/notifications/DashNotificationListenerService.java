package com.asa.dashclock.notifications;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/**
 * Created by Aaron on 7/25/13.
 */
public class DashNotificationListenerService extends NotificationListenerService {

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        // TODO - Use a ContentProvider to store the notifications.
        // TODO - Use the "addWatchContentUris(String[]) call in teh extension class to watch for data changes.
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {

    }
}
