package calendar.tools.droid.models

import android.graphics.Color

// model about one single day in MonthView section
data class DayMonthly(val value: Int, val isThisMonth: Boolean, val isToday: Boolean, val code: String, val weekOfYear: Int, var dayEvents: ArrayList<Event>, var indexOnMonthView: Int
// new variable added by Zar
    ,val isDayDisable:Boolean = false,val dayBgColor:Int = Color.parseColor("#388E3C"),
    val eventCounterBgColor:Int = Color.parseColor("#388E3C"))
