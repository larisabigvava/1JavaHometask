package com.epam.bigvava;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void testCalculate(){
        assertEquals(Main.calculate(1.0f),1.124, 0.001);
    }

}