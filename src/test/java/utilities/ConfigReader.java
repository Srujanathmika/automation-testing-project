package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop;
    public static void loadConfig(){
         prop = new Properties();
         try{
             FileInputStream file = new FileInputStream("src/test/resources/config.properties");
             prop.load(file);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

    }
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
