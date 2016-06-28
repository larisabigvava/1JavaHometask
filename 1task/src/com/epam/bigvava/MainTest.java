package com.epam.bigvava;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */

public class MainTest {

    @Test
    public void tstComparePositive(){
        assertTrue(Main.compare("1423".toCharArray()));
    }

    @Test
    public void tstCompareNegative(){
        assertFalse(Main.compare("4056".toCharArray()));
    }

    @Test
    public void tstCheckInputPositive(){
        assertTrue(Main.checkInput("1423"));
    }

    @Test
    public void tstCheckInputWrongDigitsCount(){
        assertFalse(Main.checkInput("12345"));
    }

    @Test
    public void tstCheckInputStartsWithZero(){
        assertFalse(Main.checkInput("0123"));
    }

    @Test
    public void tstCheckInputNotANumber(){
        assertFalse(Main.checkInput("d253"));
    }

}