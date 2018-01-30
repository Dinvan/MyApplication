package com.advanz101.myapplication

/**
 * Created by advanz101 on 15/9/17.
 */
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone

object DateUtils {
    val DISPLAY: SimpleDateFormat
    val DISPLAY_SHORT: SimpleDateFormat

    val SECOND_MILLISECONDS = 1000L
    val MINUTE_MILLISECONDS = SECOND_MILLISECONDS * 60
    val HOUR_MILLISECONDS = MINUTE_MILLISECONDS * 60
    val DAY_MILLISECONDS = HOUR_MILLISECONDS * 24

    init {
        //Use 12 or 24 hour time depending on device config.
        DISPLAY = SimpleDateFormat(
                "EEEE, dd MMMM yyyy",
                Locale.getDefault())
        DISPLAY_SHORT = SimpleDateFormat("EEE",
                Locale.getDefault())
        DISPLAY.timeZone = TimeZone.getDefault()
        DISPLAY_SHORT.timeZone = TimeZone.getDefault()
    }

    fun epocSecondsToDate(epocSeconds: Long): Date {
        val c = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        c.timeInMillis = epocSeconds * 1000
        return c.time
    }

    fun dateToDayDateString(date: Date,
                            useShortFormat: Boolean): String {
        return if (useShortFormat) {
            DISPLAY_SHORT.format(date)
        } else {
            DISPLAY.format(date)
        }
    }

    fun epocSecondsToDisplayDateTimeString(epocSeconds: Long): String {
        val d = epocSecondsToDate(epocSeconds)
        return dateToDayDateString(d, false)
    }


    fun sumTowNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun contcate(x: String, y: String): Unit {

    }
}
