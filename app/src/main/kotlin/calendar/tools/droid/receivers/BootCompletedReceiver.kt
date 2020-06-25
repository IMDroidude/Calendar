package calendar.tools.droid.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import calendar.tools.droid.extensions.notifyRunningEvents
import calendar.tools.droid.extensions.recheckCalDAVCalendars
import calendar.tools.droid.extensions.scheduleAllEvents
import com.simplemobiletools.commons.helpers.ensureBackgroundThread

class BootCompletedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        ensureBackgroundThread {
            context.apply {
                scheduleAllEvents()
                notifyRunningEvents()
                recheckCalDAVCalendars {}
            }
        }
    }
}
