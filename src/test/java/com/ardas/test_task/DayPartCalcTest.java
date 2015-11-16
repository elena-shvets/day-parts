package com.ardas.test_task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;

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
    public void getPart() throws Exception {
        DayPartCalc dayPartCalc = new DayPartCalc();
        Date dt = new Date();

        dt.setHours(6);

        dayPart = dayPartCalc.getPart(dt);

       assertTrue(dayPart.getName().equals("morning"));

        dt.setHours(20);
        dayPart = dayPartCalc.getPart(dt);
        assertTrue(dayPart.getName().equals("evening"));

        dt.setHours(17);
        dayPart = dayPartCalc.getPart(dt);
        assertTrue(dayPart.getName().equals("day"));
    }

    @Test
    public void getNight(){
        DayPartCalc dayPartCalc = new DayPartCalc();
        Date dt = new Date();
        dt.setHours(2);
        dayPart = dayPartCalc.getPart(dt);
        assertTrue(dayPart.getName().equals("night"));
    }

}
