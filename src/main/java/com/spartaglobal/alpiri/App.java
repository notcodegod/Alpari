package com.spartaglobal.alpiri;

import src.main.java.com.spartaglobal.alpiri.RatesFileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        RatesFileReader rates = new RatesFileReader("resources/rates.json");
//        System.out.println(rates.getRatefile());

        RatesDTO rates = new RatesDTO("resources/rates.json" );
        System.out.println(rates.getSuccessValues());
    }

}
