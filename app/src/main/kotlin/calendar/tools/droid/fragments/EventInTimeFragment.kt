package calendar.tools.droid.fragments

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import calendar.tools.droid.R
import calendar.tools.droid.extensions.config
import calendar.tools.droid.extensions.launchNewEventIntent
import calendar.tools.droid.models.Event
import calendar.tools.droid.models.ListItem
import com.simplemobiletools.commons.extensions.getAdjustedPrimaryColor
import com.simplemobiletools.commons.extensions.underlineText
import com.simplemobiletools.commons.helpers.MONTH_SECONDS
import com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener
import kotlinx.android.synthetic.main.fragment_event_list.view.*
import java.util.*

class EventInTimeFragment : MyFragmentHolder(), RefreshRecyclerViewListener {

    private val NOT_UPDATING = 0
    private val UPDATE_TOP = 1
    private val UPDATE_BOTTOM = 2

    private var FETCH_INTERVAL = 3 * MONTH_SECONDS
    private var MIN_EVENTS_TRESHOLD = 30

    private var mEvents = ArrayList<Event>()
    private var minFetchedTS = 0L
    private var maxFetchedTS = 0L
    private var wereInitialEventsAdded = false
    private var bottomItemAtRefresh: ListItem? = null

    private var use24HourFormat = false

    lateinit var mView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater.inflate(R.layout.fragment_event_list, container, false)
        mView.background = ColorDrawable(context!!.config.backgroundColor)
        mView.calendar_events_list_holder?.id = (System.currentTimeMillis() % 100000).toInt()
        mView.calendar_empty_list_placeholder_2.apply {
            setTextColor(context.getAdjustedPrimaryColor())
            underlineText()
            setOnClickListener {
                context.launchNewEventIntent(getNewEventDayCode())
            }
        }

        use24HourFormat = context!!.config.use24HourFormat
        updateActionBarTitle()
        return mView
    }

    override fun goToToday() {

    }

    override fun showGoToDateDialog() {

    }

    override fun refreshEvents() {

    }

    override fun shouldGoToTodayBeVisible(): Boolean {
        return false
    }

    override fun updateActionBarTitle() {

    }

    override fun getNewEventDayCode(): String {
        return ""
    }

    override fun refreshItems() {

    }
}
