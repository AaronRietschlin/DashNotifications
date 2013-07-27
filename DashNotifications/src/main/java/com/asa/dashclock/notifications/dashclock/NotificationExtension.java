package com.asa.dashclock.notifications.dashclock;

import android.content.Intent;

import com.asa.dashclock.notifications.SettingsActivity;
import com.google.android.apps.dashclock.api.DashClockExtension;
import com.google.android.apps.dashclock.api.ExtensionData;

/**
 * Created by Aaron on 7/25/13.
 */
public class NotificationExtension extends DashClockExtension {
    @Override
    protected void onUpdateData(int i) {
        // TODO Get the notifications.
        // TODO Create #ExtensionData object
        // TODO Call #publishUpdate with the ExtensionData

        // TODO This is test data
        ExtensionData data = new ExtensionData();
        data.clickIntent(new Intent(getApplicationContext(), SettingsActivity.class)).contentDescription("Test Data for now.").expandedBody("Expanded Body content.").expandedTitle("Expanded title");
        publishUpdate(data);
    }
}
