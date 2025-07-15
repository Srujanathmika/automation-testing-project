package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    //  Load config.properties file once
    public static void loadConfig() {
        prop = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            prop.load(file);
        } catch (IOException e) {
            throw new RuntimeException(" Failed to load config.properties", e);
        }
    }

    //  Get String values (used for browser, url, etc.)
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    //  Get Integer values (used for timeout, retries, etc.)
    public static int getIntProperty(String key) {
        try {
            return Integer.parseInt(prop.getProperty(key));
        } catch (NumberFormatException e) {
            throw new RuntimeException(" Property '" + key + "' is not a valid number in config.properties");
        }
    }
}
