package com.epam.bigvava;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void testParse() {
        assertNotNull(Main.parse("12.0"));
    }

    @Test
    public void tstFunc(){
        assertEquals(Main.func(0.1f,0.1f,0.1f), 100.01607736031484, 0.01);
    }
}