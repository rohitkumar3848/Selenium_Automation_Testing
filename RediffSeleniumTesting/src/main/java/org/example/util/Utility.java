package org.example.util;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Utility {

    public static String properties(String key) {
        try {
            String filePath = System.getProperty("user.dir")
                    + File.separator + "src"
                    + File.separator + "main"
                    + File.separator + "resources"
                    + File.separator + "configurations.properties";

            FileReader reader = new FileReader(filePath);
            Properties prop = new Properties();
            prop.load(reader);

            return prop.getProperty(key);

        } catch (Exception e) {
            throw new RuntimeException("Failed to read properties file", e);
        }
    }
}
