package com.ardas.test_task;


import org.apache.log4j.Logger;

import java.util.Date;


/**
 * Class {@link com.ardas.test_task.App}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 12.11.15
 */
public class App {

    private static final Logger LOG = Logger.getLogger(App.class);
    private static final Message I18n = new Message();


    public static void main(String[] args) {

        DayPartCalc calc = new DayPartCalc();
        Date dt = new Date();
        DayPart dayPart = calc.getPart(dt);

        showMessage(dayPart);
        logMessage(dayPart);
    }

    /**
     * Method to show message
     * @param dayPart
     */
    private static void showMessage(DayPart dayPart) {

        System.out.println(I18n.getMessage("hi." + dayPart.getName()));
    }

    /**
     * Method for message logging
     * @param dayPart
     */
    private static void logMessage(DayPart dayPart) {
        LOG.info(dayPart.getName() + " start at " + dayPart.getBeginTime() + " & finish at " + dayPart.getEndTime());
    }
}
