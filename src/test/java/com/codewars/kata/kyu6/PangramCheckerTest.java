package com.codewars.kata.kyu6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codewars.katas.kyu6.PangramChecker;

public class PangramCheckerTest {

    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
    
    
    @Test
    public void testRandom() {
      String pangram2 = "kgbxftnvmcu s l aedw zjh royq";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
}
