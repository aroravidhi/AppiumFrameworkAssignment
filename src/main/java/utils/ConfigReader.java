package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties props = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("config/config.properties");
            props.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Properties getProperties() {
        return props;
    }

    public static String get(String appId)
    {
        return props.getProperty(appId);
    }
}


