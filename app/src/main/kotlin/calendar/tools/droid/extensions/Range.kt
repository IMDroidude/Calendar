package calendar.tools.droid.extensions

import android.util.Range

fun Range<Int>.touch(other: Range<Int>) = (upper > other.lower && lower < other.upper) || (other.upper > lower && other.lower < upper)
