package com.codewars.katas.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindUniqueTest {

    private double precision = 0.0000000000001;
    
    @Test
    public void sampleTestCases() {
    	assertEquals(0.55, FindUnique.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }), precision);
        assertEquals(1.0, FindUnique.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUnique.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

}
