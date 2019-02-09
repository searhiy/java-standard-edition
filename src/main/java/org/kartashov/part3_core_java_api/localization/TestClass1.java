package org.kartashov.part3_core_java_api.localization;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by Serhii K. on 11/23/2015.
 */
public class TestClass1 {

    public static void main(String[] args) {
        Locale locale1 = Locale.FRENCH;
        Locale locale2 = Locale.FRANCE;
        Locale locale3 = new Locale.Builder().setLanguage("fr").build();
        Locale locale4 = new Locale.Builder().setLanguage("fr").
                setRegion("FR").build();
        Locale locale5 = new Locale("fr");
        Locale locale6 = new Locale("fr","FR");

        System.out.println(locale1.equals(locale3)); // true
        System.out.println(locale2.equals(locale6)); // true
        System.out.println(locale4.equals(locale5)); // false

        // -Djava.locale.providers=HOST,SPI,CLDR,JRE
        Properties properties = System.getProperties();
        Enumeration names = properties.propertyNames();
        while (names.hasMoreElements()){
            String key = (String)names.nextElement();
            String value = properties.getProperty(key);

            System.out.println(key+"="+value);
        }
    }
}
