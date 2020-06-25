package calendar.tools.droid.interfaces

import calendar.tools.droid.models.Event


interface WeeklyCalendar {
    fun updateWeeklyCalendar(events: ArrayList<Event>)
}
