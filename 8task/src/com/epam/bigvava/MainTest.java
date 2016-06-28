package com.epam.bigvava;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void testSum(){
        assertEquals(Main.sum(new int[]{1, 2, 3, 4, 5},2),6);
    }

    @Test
    public void tstParse(){
        assertNotNull(Main.parse("10"));
    }
}