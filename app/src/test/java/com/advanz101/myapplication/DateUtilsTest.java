package com.advanz101.myapplication;

import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertEquals;

/**
 * Created by advanz101 on 15/9/17.
 */

public class DateUtilsTest {
    @Test
    public void dateUtilsFormat_isCorrect() throws Exception {
        long epoc = 1446885450; //7th Nov 2015
        Date date = DateUtils.INSTANCE.epocSecondsToDate(epoc);
        assertEquals("Date time in millis is wrong",
                epoc * 1000, date.getTime());
        String day = DateUtils.INSTANCE.dateToDayDateString(date, true);
        assertEquals("Day is wrong", "SAT", day);
    }

    @Test
    public void dateUtilsFormat_anotherTest() throws Exception {

    }

    @Test
    public  void checkSum_isCorrect() throws Exception{
        int c= DateUtils.INSTANCE.sumTowNumbers(5,5);
        assertEquals("Result",10,c);
    }
}
