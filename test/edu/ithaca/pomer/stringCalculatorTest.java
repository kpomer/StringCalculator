package edu.ithaca.pomer;

import static org.junit.jupiter.api.Assertions.*;

class stringCalculatorTest {

    stringCalculator myCalc = new stringCalculatorImpl();

    @org.junit.jupiter.api.Test
    public void Add(){
        //Empty String
        assertEquals(0, myCalc.Add(""), "should return 0 for an empty string");

        //One value in string
        assertEquals(0, myCalc.Add("0"), "should return 0");
        assertEquals(1, myCalc.Add("1"), "should return 1");
        assertEquals(-3, myCalc.Add("-3"), "should return -3");


        //Two values in string
        assertEquals(1, myCalc.Add("0,1"), "should return 1");
        assertEquals(10, myCalc.Add("5,5"), "should return 10");
        assertEquals(-1, myCalc.Add("3,-4"), "should return -1");
        assertEquals(0, myCalc.Add("0,0"), "should return 0");
        assertEquals(-7, myCalc.Add("-3,-4"), "should return -7");

        //Unknown amount of numbers in string
        assertEquals(-2, myCalc.Add("0,1,-3"), "should return -2");
        assertEquals(1, myCalc.Add("0,0,0,0,1"), "should return 1");
        assertEquals(1, myCalc.Add("1,0,0,0,0,0,0"), "should return 1");
        assertEquals(0, myCalc.Add("0,0,0,0,0,0"));


        //New lines to split up numbers in string
        assertEquals(4, myCalc.Add("1\n3"), "should return 4");
        assertEquals(8, myCalc.Add("1,3\n4"), "should return 8");
        assertEquals(10, myCalc.Add("2\n5\n3"), "Should return 10");
        assertEquals(-2, myCalc.Add("-3,-4\n5"), "should return -2");

    }

}