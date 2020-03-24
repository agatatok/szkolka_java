package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.*;

class ZadaniaIndywidualneTest {

    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(ZadaniaIndywidualne.class);

    @Test
    @DisplayName("Check whether given integer is right")
    void getInteger() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        int returnedValue = ZadaniaIndywidualne.getInteger();
        //then
        assertEquals(ZadaniaIndywidualne.intToGet, returnedValue);
    }

    @Test
    @DisplayName("Check whether given boolean is right")
    void getBool() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        boolean returnedValue = ZadaniaIndywidualne.getBool();
        //then
        assertEquals(ZadaniaIndywidualne.booleanToGet, returnedValue);
    }

    @Test
    @DisplayName("Check whether given byte is right")
    void getByte() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        byte returnedValue = ZadaniaIndywidualne.getByte();
        //then
        assertEquals(ZadaniaIndywidualne.byteToGet, returnedValue);
    }

    @Test
    @DisplayName("Check whether given short is right")
    void getShort() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        short returnedValue = ZadaniaIndywidualne.getShort();
        //then
        assertEquals(ZadaniaIndywidualne.shortToGet, returnedValue);
    }

    @Test
    @DisplayName("Check whether given long is right")
    void getLong() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        long returnedValue = ZadaniaIndywidualne.getLong();
        //then
        assertEquals(ZadaniaIndywidualne.longToGet, returnedValue);
    }

    @Test
    @DisplayName("Check whether given char is right")
    void getChar() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        char returnedValue = ZadaniaIndywidualne.getChar();
        //then
        assertEquals(ZadaniaIndywidualne.charToGet, returnedValue);
    }

    @Test
    @DisplayName("Check whether given float is right")
    void getFloat() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        float returnedValue = ZadaniaIndywidualne.getFloat();
        //then
        assertEquals(ZadaniaIndywidualne.floatToGet, returnedValue);
    }

    @Test
    @DisplayName("Check whether given double is right")
    void getDouble() {
        //given the static value from ZadaniaIndywidualne Class
        //when
        double returnedValue = ZadaniaIndywidualne.getDouble();
        //then
        assertEquals(ZadaniaIndywidualne.doubleToGet, returnedValue);
    }

    @Test
    @DisplayName("Log Hello")
    void logHello() {
        //given string "hello"
        //when
        //then
        logs.assertContains("Hello");

    }

    @Test
    void logHelloAndSomeMessage() {
        //given string "hello" and some message
        var msg = "World";
        //when
        ZadaniaIndywidualne.LogHelloAndSomeMessage(msg);
        //then
        logs.assertContains("Hello World");
    }

    @Test
    void getHelloAndSomeMessage() {
        //given string "hello" and some message
        var msg = "World";
        //when
        String result = ZadaniaIndywidualne.GetHelloAndSomeMessage(msg);
        //then
        assertEquals("Hello World",result);
    }
}