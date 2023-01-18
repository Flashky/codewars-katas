package com.codewars.katas.kyu6;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SmileFacesTest {

	 @Test
	    public void test1() {
	        List<String> a = new ArrayList<String>();
	        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
	        assertEquals(2, SmileFaces.countSmileys(a));
	    }
	    
	    @Test
	    public void test2() {
	        List<String> a = new ArrayList<String>();
	        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
	        assertEquals(1, SmileFaces.countSmileys(a));
	    }
	    
	    @Test
	    public void test4() {
	        List<String> a =  new ArrayList<String>();
	        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
	        assertEquals(2, SmileFaces.countSmileys(a));
	    }
	    
	    @Test
	    public void test5() {
	        List<String> a =  new ArrayList<String>();
	        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
	        assertEquals(4, SmileFaces.countSmileys(a));
	    }

}
