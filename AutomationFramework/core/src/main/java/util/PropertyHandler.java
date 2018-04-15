package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;

/**
 * Created by Vahid on 14/4/18.
 */
public class PropertyHandler {

    Logger logger = LoggerFactory.getLogger(PropertyHandler.class);
    private Properties properties;
    private String propertyFileName = "";
    private PropertyHandler() {

    }

    private static PropertyHandler propertyHandler;

    public static PropertyHandler getInstance() {
        if (propertyHandler == null) {
            propertyHandler = new PropertyHandler();

        }
        return propertyHandler;
    }

    public void loadProperties(String propertyFileName){
        File propFile = new File(propertyFileName);
        try {
            InputStream io = new FileInputStream(propFile);
            properties = new Properties();
            properties.load(io);
            this.propertyFileName = propertyFileName;
        } catch (IOException e) {
            logger.error("Cannot find/read the property file:" + propertyFileName);
            // TODO: decide if the application needs to be closed or not
        }
    }

    public String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value.equals(null) || value.equals(""))
            logger.error("Cannot load property value for key:" + key);
        // TODO: decide if the application needs to be closed or not

        return value;
    }

    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
        try {
            properties.store(new FileOutputStream(propertyFileName),null);
        } catch (IOException e) {
            logger.error("cannot write to/ access the property file:" + propertyFileName);
        }
        // TODO: decide if the application needs to be closed or not
    }


}
