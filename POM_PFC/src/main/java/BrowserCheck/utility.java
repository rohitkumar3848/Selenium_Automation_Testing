package BrowserCheck;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class utility {
    public static String properties(String data) throws Exception {
        String propertiesData = null;
        try {
            String filePath = System.getProperty("user.dir")
                    + File.separator
                    + "src" + File.separator
                    + "main" + File.separator
                    + "resources" + File.separator
                    + "configuration.properties";
            FileReader fileReader = new FileReader(filePath);
            Properties p = new Properties();
            p.load(fileReader);
            propertiesData = p.getProperty(data);
        } catch (Exception e) {
            System.out.println("Properties Exception-->" + e);
        }
        return propertiesData;
    }
}

