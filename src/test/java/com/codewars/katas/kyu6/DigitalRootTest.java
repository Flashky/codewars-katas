package com.codewars.katas.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitalRootTest {

    @Test
    public void test16() {
      assertEquals( "Nope!" , 7, DigitalRoot.digitalRoot(16));
    }      
    
    @Test
    public void test456() {
      assertEquals( "Nope!" , 6, DigitalRoot.digitalRoot(456));
    }

    @Test
    public void test942() {
      assertEquals( "Nope!" , 6, DigitalRoot.digitalRoot(942));
    }
    
    @Test
    public void test132189() {
      assertEquals( "Nope!" , 6, DigitalRoot.digitalRoot(132189));
    }
    
    @Test
    public void test493193() {
      assertEquals( "Nope!" , 2, DigitalRoot.digitalRoot(493193));
    }
}
