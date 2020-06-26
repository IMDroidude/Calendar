package calendar.tools.droid.activities

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import calendar.tools.droid.extensions.config
import calendar.tools.droid.extensions.getNewEventTimestampFromCode
import calendar.tools.droid.helpers.*
import com.simplemobiletools.commons.activities.BaseSplashActivity
import com.simplemobiletools.commons.extensions.baseConfig
import org.joda.time.DateTime

class SplashActivity : BaseSplashActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        baseConfig.textColor = Color.DKGRAY
        baseConfig.backgroundColor = Color.WHITE
        baseConfig.primaryColor = Color.parseColor("#4169E1")
        baseConfig.customNavigationBarColor = Color.RED
        baseConfig.navigationBarColor = Color.WHITE

        config.allowChangingTimeZones = true

    }

    override fun initActivity() {
        when {
            intent.extras?.containsKey(DAY_CODE) == true -> Intent(this, MainActivity::class.java).apply {
                putExtra(DAY_CODE, intent.getStringExtra(DAY_CODE))
                putExtra(VIEW_TO_OPEN, intent.getIntExtra(VIEW_TO_OPEN, LAST_VIEW))
                startActivity(this)
            }
            intent.extras?.containsKey(EVENT_ID) == true -> Intent(this, MainActivity::class.java).apply {
                putExtra(EVENT_ID, intent.getLongExtra(EVENT_ID, 0L))
                putExtra(EVENT_OCCURRENCE_TS, intent.getLongExtra(EVENT_OCCURRENCE_TS, 0L))
                startActivity(this)
            }
            intent.action == SHORTCUT_NEW_EVENT -> {
                val dayCode = Formatter.getDayCodeFromDateTime(DateTime())
                Intent(this, EventActivity::class.java).apply {
                    putExtra(NEW_EVENT_START_TS, getNewEventTimestampFromCode(dayCode))
                    startActivity(this)
                }
            }
            else -> startActivity(Intent(this, MainActivity::class.java))
        }
        finish()
    }
}
