package com.spartaglobal.alpiri;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ratesTests {
     RatesDTO rates;

    @Before
    public void setup(){
        rates = new RatesDTO("resources/rates.json");
    }

    @Test
    public void testSuccessResponse(){
        Assert.assertTrue(rates.getSuccessValues());
    }
}
