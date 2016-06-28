package com.epam.bigvava;

import org.junit.Test;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void tstConcate(){
        assertArrayEquals(Main.concate(new int[]{0,1,2,3,4},new int[]{0,1},4),new int[]{0,1,2,3,0,1,4});
    }

}