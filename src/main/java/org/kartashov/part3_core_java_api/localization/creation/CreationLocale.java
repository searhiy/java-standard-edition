package org.kartashov.part3_core_java_api.localization.creation;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Created by Serhii K. on 11/23/2015.
 */
public class CreationLocale {

    public static void main(String[] args) {
        Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); //L1

        Locale ukraine = new Locale("uk", "UA");
        msg(ukraine);

        Locale defaultLocale = Locale.getDefault();
        msg(defaultLocale);

        Locale locale = Locale.forLanguageTag("ara-AE");
        System.out.println("ara-AE: " + locale);
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayLanguage(ukraine));
        System.out.println(locale.getLanguage());
        System.out.println("end");

        //Locale.setDefault(Locale.ITALY);
        //Locale.setDefault(Locale.FRANCE);
        Locale.setDefault(Locale.GERMAN);
        //Locale.setDefault(Locale.ENGLISH);
        Locale[] all = Locale.getAvailableLocales();
        List list = Arrays.asList(all);
        msg("All available: " + list);

        //Locale loc = new Locale("fr", "FR");
        Locale loc = new Locale("uk", "UA");
        //Locale loc = new Locale("ru", "RUS");
        //Locale loc = new Locale("pl", "POL");
        //Locale loc = new Locale("rum", "MDA");
        //Locale loc = new Locale("ger", "DE");
        //Locale loc = new Locale("fren", "FRen")); // won't identify
        msg("Code Country: " + loc.getCountry());
        msg("Code Language: " + loc.getLanguage());
        msg("Display Country: " + loc.getDisplayCountry());
        msg("Display Language: " + loc.getDisplayLanguage());
        msg("Display Name: " + loc.getDisplayName());
    }

    static void msg(Object str){
        System.out.println(str);
    }

    // 1
    public static void builder(){
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage("fr");
        builder.setRegion("CA");
        Locale locale = builder.build();
        msg(locale);
    }

    //2
    public static void constructor(){
        // specify only language
        Locale france = new Locale("fr");
        msg(france);
        // specify language and country
        Locale germany = new Locale("de", "DE");
        msg(germany);
        // specify language, country and variant
        Locale japan = new Locale("ja", "JP", "MAC");

        msg(japan);
    }

    // 3
    public static void factoryMethod(){
        Locale locale = Locale.forLanguageTag("fr-FR");
        msg(locale);
    }

    // 4
    public static void constants(){
        Locale locale1 = Locale.GERMAN; // with country
        Locale locale2 = Locale.GERMANY; // language only
        Locale locale3 = Locale.CHINA;
        Locale locale4 = Locale.CHINESE;
    }


}
