package calendar.tools.droid.services

import android.app.IntentService
import android.content.Intent
import calendar.tools.droid.extensions.config
import calendar.tools.droid.extensions.eventsDB
import calendar.tools.droid.extensions.rescheduleReminder
import calendar.tools.droid.helpers.EVENT_ID

class SnoozeService : IntentService("Snooze") {
    override fun onHandleIntent(intent: Intent?) {
        if (intent != null) {
            val eventId = intent.getLongExtra(EVENT_ID, 0L)
            val event = eventsDB.getEventWithId(eventId)
            rescheduleReminder(event, config.snoozeTime)
        }
    }
}
