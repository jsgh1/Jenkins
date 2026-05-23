package com.jsgh1.jenkinsdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void getGreetingShouldReturnExpectedMessage() {
        assertEquals("Proyecto Jenkins funcionando correctamente", App.getGreeting());
    }
}
