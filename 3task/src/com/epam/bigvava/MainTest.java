package com.epam.bigvava;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void testParsePositive(){
        assertNotNull(Main.parse("10.0"));
    }

    @Test
    public void testParseNegative(){
        assertNull(Main.parse("-10.0"));
    }

}