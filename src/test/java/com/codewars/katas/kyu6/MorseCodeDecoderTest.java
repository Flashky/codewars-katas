package com.codewars.katas.kyu6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() {
      assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }

}
