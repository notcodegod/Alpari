package src.main.java.com.spartaglobal.alpiri;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesFileReader {

    private FileReader ratefile;

    public RatesFileReader(String filePath)
    {
        try {
            ratefile = new FileReader(filePath);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            }
    }


    public FileReader getRatefile() {
        return ratefile;
    }
}
