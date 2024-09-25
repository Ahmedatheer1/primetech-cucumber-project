package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;


    static {
        String path = "src/test/resource/configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();//close the stream
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * This method will return the value of the key that was passed as a parameter
     * from the property file
     *
     * @param key the key from the property file
     * @return
     */
    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }

    public static String getPropertyValue(String baseUrl) {
        return baseUrl;
    }
}

