package calendar.tools.droid.interfaces

import android.util.SparseArray
import calendar.tools.droid.models.DayYearly

import java.util.*

interface YearlyCalendar {
    fun updateYearlyCalendar(events: SparseArray<ArrayList<DayYearly>>, hashCode: Int)
}
