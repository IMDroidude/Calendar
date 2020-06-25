package calendar.tools.droid.extensions

import calendar.tools.droid.helpers.MONTH
import calendar.tools.droid.helpers.WEEK
import calendar.tools.droid.helpers.YEAR

fun Int.isXWeeklyRepetition() = this != 0 && this % WEEK == 0

fun Int.isXMonthlyRepetition() = this != 0 && this % MONTH == 0

fun Int.isXYearlyRepetition() = this != 0 && this % YEAR == 0
