package com.epam.bigvava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void tstParsePositive(){
        assertNotNull(Main.parse("2.0"));
    }
    @Test
    public void tstParseNegative(){
        assertNull(Main.parse("tuy"));
    }


    @Test
    public void testPowerNegativeNumber(){
        assertEquals(Main.power(-2f),16,0.01);
    }

    @Test
    public void testPowerNotNegativeNumber(){
        assertEquals(Main.power(2f),4,0.01);
    }
}