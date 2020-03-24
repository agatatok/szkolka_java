package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class ZadaniaIndywidualne {

    private static final Logger LOG = getLogger("pl.accenture.szkolka.pp.ZadaniaIndywidualne");
    // done 1 zadeklaruj zmienne z typami prostymi występującymi z Javie

    public static int intToGet = 10;
    public static boolean booleanToGet = true;
    public static byte byteToGet = 2;
    public static short shortToGet = 100;
    public static long longToGet = 1000;
    public static char charToGet = 'a';
    public static float floatToGet = 10.5f;
    public static double doubleToGet = 10.5;


    // done 2 zadeklaruj metody zwracające te zmienne
    public static int getInteger() {
        return intToGet;
    }
    public static boolean getBool() {
        return booleanToGet;
    }
    public static byte getByte() {
        return byteToGet;
    }
    public static short getShort() {
        return shortToGet;
    }

    public static long getLong() {
        return longToGet;
    }

    public static char getChar() {
        return charToGet;
    }
    public static float getFloat() {
        return floatToGet;
    }

    public static double getDouble() {
        return doubleToGet;
    }


    // done 3 utwórz testy dla metod z punktu 2

    // done 4 utwórz metodę void wypisującą do loggera "Hello"

    public static void LogHello()
    {
        LOG.log(Level.INFO, "Hello");
    }

    // done 5 utwórz metodę void wypisującą do loggera "Hello " + przekazany do metody argument (String)

    public static void LogHelloAndSomeMessage(String msg)
    {
        LOG.log(Level.INFO, "Hello "+msg);
    }

    // done 6 utwórz metodę zwracającą  "Hello " + przekazany do metody argument (String)
    public static String GetHelloAndSomeMessage(String msg)
    {
        return String.format("Hello %s", msg);
    }

    /*
            done 7 utwórz testy dla metod z punktów 4-6 dla testowania logowanych wartości, użyj
            https://github.com/netmikey/logunit
     */
}
