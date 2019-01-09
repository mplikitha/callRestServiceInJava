package com.common.api.propertymanager;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertyManager {
	
	 private static PropertyManager instance = new PropertyManager();

     private Properties properties;

     public static PropertyManager get() {

           return instance;

     }

     private PropertyManager() {

           properties = new Properties();

     }

    

     /**

     * Return the named property value, or null if the property is not defined.

     * It will try ${env}.propName or ${app.cfg}.propName if the propName is not found.

     */

     public String getProperty(String propName) {

           if (propName == null) {

                  return null;



           }

           String ret = properties.getProperty(propName);

           return ret;

     }



     public void removeProperty(String propName) {

           properties.remove(propName);

     }



     public synchronized void loadProperties(String... propertyFileNames) {

           if (propertyFileNames != null) {

                  for (String propFile : propertyFileNames) {

                        Properties prop = loadProperties(propFile);

                        addAllProperties(prop);

                  }

           }

     }

    

     Properties getProperties() {

           return properties;

     }



     private Properties loadProperties(String propertyFileName) {

           Properties ret = new Properties();

           try {

        	   
        	   InputStream stream = new FileInputStream(propertyFileName);
        	   ret.load(stream);
        	   
           } catch (Throwable e) {

                  try {

                	  ret.load(new FileInputStream("resources/application.properties"));

                  } catch (Throwable t) {

                        if (propertyFileName.startsWith("file:")) { //

                               try {

                            	   ret.load(new FileInputStream("resources/application.properties"));
                               } catch (Throwable t3) {

                               }

                        }

                  }

           }

          

           Map<String,String> props = trimPropertyNamesAndValues(ret);

           ret.clear();

           ret.putAll(props);

           return ret;

     }



     private void addAllProperties(Map prop) {

                  this.properties.putAll(prop);

     }

    

     private Map<String,String> trimPropertyNamesAndValues(Map prop) {

           Map<String,String> ret = new HashMap<String,String>();

           for (Iterator it = prop.entrySet().iterator(); it.hasNext();) {

                  Map.Entry entry = (Map.Entry) it.next();

                  String key = entry.getKey().toString().trim();

                  ret.put(key, ((String)entry.getValue()).trim());

           }

           return ret;

     }

}
