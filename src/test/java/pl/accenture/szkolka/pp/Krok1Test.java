package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class Krok1Test {

    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(Krok1.class);

    @Test
    @DisplayName("Agata -> Hello, Agata!")
    void hello() {
        // given
        var name = "Agata";
        // when
        Krok1.hello(name);
        // then
        logs.assertContains("Hello, Agata!");

    }
}