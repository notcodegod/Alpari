package com.spartaglobal.alpiri;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ratesTests {
    public static RatesDTO rates;

    @BeforeClass
    public static void setup(){
        rates = new RatesDTO("resources/rates.json");

    }

    @Test
    public void testSuccessResponse(){
        Assert.assertTrue(rates.getSuccessValues());
    }
@Test
    public void testTimeStampMatchesDate()
    {
        //Assert.assertEquals(rates.getDatefromTimestamp(), rates.getDate());
        Assert.assertTrue(rates.getDatefromTimestamp().contentEquals(rates.getDate()));
    }


}
