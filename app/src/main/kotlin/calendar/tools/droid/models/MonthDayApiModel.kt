package calendar.tools.droid.models

import android.graphics.Color

data class MonthDayApiModel(val dayCode:String, val isDayDisable:Boolean,
                            val dayBgColor:Int = Color.parseColor("#388E3C"),
                            val eventCounterBgColor:Int = Color.parseColor("#388E3C"))