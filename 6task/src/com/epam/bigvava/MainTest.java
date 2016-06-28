package com.epam.bigvava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void tstSum(){
        assertEquals(Main.sum(new Integer[]{0, 1, 2}),2);
    }

    @Test
    public void testParsePositive() {
        assertNotNull(Main.parse("1"));
    }

    @Test
    public void testParseNegative() {
        assertNull(Main.parse("tst"));
    }

}