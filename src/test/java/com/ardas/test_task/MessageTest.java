package com.ardas.test_task;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertTrue;
/**
 * Class {@link com.ardas.test_task.MessageTest}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 15.11.15
 */

@RunWith(MockitoJUnitRunner.class)
public class MessageTest {


    @Test
    public void getMessageEN(){
        Message I18n = new Message("en");
        assertTrue(I18n.getMessage("hi.day").equals("Good DAY, World!"));
    }

}
