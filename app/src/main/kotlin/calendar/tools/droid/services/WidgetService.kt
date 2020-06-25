package calendar.tools.droid.services

import android.content.Intent
import android.widget.RemoteViewsService
import calendar.tools.droid.adapters.EventListWidgetAdapter


class WidgetService : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent) = EventListWidgetAdapter(applicationContext)
}
