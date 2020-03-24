package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.*;

/**
 *  zmienne | metody | JUnit
 */
public class Krok1 {

    private static final Logger LOG = getLogger("pl.accenture.szkolka.pp.Krok1");

//    W klasie utwórz metodę public static void hello(String name) logującą "Hello, !"
//    Zadeklaruj logger w klasie Użyj logger w metodzie


    public static void hello(String name){
        LOG.log(Level.INFO, String.format("Hello, %s!", name));
    }


}
