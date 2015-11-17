package com.ardas.test_task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalTime;

import static org.junit.Assert.assertTrue;

/**
* Class {@link com.ardas.test_task.DayPartCalcTest}
*
* @author Elena Shvets
* @version 1.0
* @since 15.11.15
*/
@RunWith(MockitoJUnitRunner.class)
public class DayPartCalcTest {

    DayPart dayPart;



    @Test
    public void getMorning() throws Exception {
        DayPartCalc dayPartCalc = new DayPartCalc();
        LocalTime localTime = LocalTime.of(6, 0);
        dayPart = dayPartCalc.getPart(localTime);
        assertTrue(dayPart.getName().equals("morning"));
    }

    @Test
    public void getEvening() throws Exception {
        DayPartCalc dayPartCalc = new DayPartCalc();
        LocalTime localTime = LocalTime.of(21, 15);
        dayPart = dayPartCalc.getPart(localTime);
        assertTrue(dayPart.getName().equals("evening"));

    }
    @Test
    public void getDay() throws Exception {
        DayPartCalc dayPartCalc = new DayPartCalc();
        LocalTime localTime = LocalTime.of(17, 45);
        dayPart = dayPartCalc.getPart(localTime);
        assertTrue(dayPart.getName().equals("day"));
    }


    @Test
    public void getNight(){
        DayPartCalc dayPartCalc = new DayPartCalc();
        LocalTime localTime = LocalTime.of(2,30);

        dayPart = dayPartCalc.getPart(localTime);
        assertTrue(dayPart.getName().equals("night"));
    }
}
