package com.epam.bigvava;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Larisa_Bigvava on 6/28/2016.
 */
public class MainTest {

    @Test
    public void tstParseEven(){
        assertNotNull(Main.parseForEven("2"));
    }

    @Test
    public void tstParseZero(){
        assertNull(Main.parseForEven("0"));
    }

    @Test
    public void tstParseNotEven(){
        assertNull(Main.parseForEven("5"));
    }

}