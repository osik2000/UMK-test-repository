package com.example.workshops;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class TestClassTests {

    @Test
    public void shouldPrintTestClassAsString(){
        // given
        Text text = new Text(1, "Tekst testowy");
        // then
        assert Objects.equals(text.toString(), "Text[1]: Tekst testowy");
    }

}
