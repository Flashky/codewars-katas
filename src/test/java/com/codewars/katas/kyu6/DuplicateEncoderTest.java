package com.codewars.katas.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateEncoderTest {
    
	@Test
    public void test() {
      assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
      assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }

}
