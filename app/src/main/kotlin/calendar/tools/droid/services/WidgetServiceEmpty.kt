package calendar.tools.droid.services

import android.content.Intent
import android.widget.RemoteViewsService
import calendar.tools.droid.adapters.EventListWidgetAdapterEmpty


class WidgetServiceEmpty : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent) = EventListWidgetAdapterEmpty(applicationContext)
}
