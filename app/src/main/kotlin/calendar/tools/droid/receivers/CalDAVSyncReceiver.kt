package calendar.tools.droid.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import calendar.tools.droid.extensions.config
import calendar.tools.droid.extensions.recheckCalDAVCalendars
import calendar.tools.droid.extensions.refreshCalDAVCalendars
import calendar.tools.droid.extensions.updateWidgets

class CalDAVSyncReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (context.config.caldavSync) {
            context.refreshCalDAVCalendars(context.config.caldavSyncedCalendarIds, false)
        }

        context.recheckCalDAVCalendars {
            context.updateWidgets()
        }
    }
}
