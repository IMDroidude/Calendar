package calendar.tools.droid.interfaces

import android.content.Context
import calendar.tools.droid.models.DayMonthly

import org.joda.time.DateTime

interface MonthlyCalendar {
    fun updateMonthlyCalendar(context: Context, month: String, days: ArrayList<DayMonthly>, checkedEvents: Boolean, currTargetDate: DateTime)
}
