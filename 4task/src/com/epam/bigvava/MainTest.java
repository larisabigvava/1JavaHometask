package com.epam.bigvava;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void testIsEnter(){
        assertTrue(Main.isEnter(0,0));
    }

    @Test
    public void tstParsePositive(){
        assertNotNull(Main.parse("-1"));
    }


    @Test
    public void tstParseNegative(){
        assertNull(Main.parse("edr"));
    }

}