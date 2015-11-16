package com.ardas.test_task;


import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Class {@link com.ardas.test_task.DayPartCalc}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 15.11.15
 */
public class DayPartCalc {
    private static final Logger LOG = Logger.getLogger(DayPartCalc.class);

    private Calendar calendar = GregorianCalendar.getInstance();

    /**
     * Gets part of a day by time
     * @param date
     * @return dayPartRes
     * @throws IllegalArgumentException
     */
    public DayPart getPart(Date date) throws IllegalArgumentException {
        DayPart dayPartRes = null;

        calendar.setTime(date);
        int i = getSecondsByParams(
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            calendar.get(Calendar.SECOND)
        );

        DayPart[] list = DayPart.values();

        for (DayPart n : list) {

            int sec_begin = getSecondsByStr(n.getBeginTime());
            int sec_end = getSecondsByStr(n.getEndTime());

            /**
            * different logic for night (sec_begin > sec_end)
            **/
            if (
                (sec_begin < sec_end && i >= sec_begin && i < sec_end)
                ||
                (sec_begin > sec_end && (i >= sec_begin || i < sec_end))
            ) {
                dayPartRes = n;
                break;
            }
        }

        if (dayPartRes.equals(null)) {
            throw new IllegalArgumentException("Day's part not found");
        }

        return dayPartRes;
    }

    /**
     * Parse String time to int
     * @param time
     * @return getSecondsByParams()
     */
    private int getSecondsByStr(String time)
    {
        String[] parts = time.split(":");

        return getSecondsByParams(
            Integer.parseInt(parts[0]),
            Integer.parseInt(parts[1]),
            Integer.parseInt(parts[2])
        );
    }

    /**
     *Convert hours/minutes/seconds to seconds
     * @param hours
     * @param minutes
     * @param seconds
     * @return number
     */
    private int getSecondsByParams(int hours, int minutes, int seconds) {
        return hours * 3600 + minutes * 60 + seconds;
    }
}
