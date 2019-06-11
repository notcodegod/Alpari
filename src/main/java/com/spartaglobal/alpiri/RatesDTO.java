package com.spartaglobal.alpiri;



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class RatesDTO {


    private JSONObject fullRatesFile;

    public RatesDTO(String filePath){
        //
        src.main.java.com.spartaglobal.alpiri.RatesFileReader ratesfile = new src.main.java.com.spartaglobal.alpiri.RatesFileReader(filePath);

        JSONParser parser = new JSONParser();
        try{
        Object ratesObj = parser.parse(ratesfile.getRatefile());
        fullRatesFile = (JSONObject) ratesObj;
        }catch (ParseException |IOException e){
            e.printStackTrace();
        }


    }

    public void printRate(){
        System.out.println(fullRatesFile.toString());
    }

    public boolean getSuccessValues(){
        return (boolean) fullRatesFile.get("success"); //right now is just  string so we convert it to boolean

    }


}
