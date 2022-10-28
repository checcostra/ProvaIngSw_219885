package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Algorithmstest {

    FunnyAlgorithms f = new FunnyAlgorithms();
    static String stringcheck;
    static String stringcheck2;
    static String stringcheck3;
    static String stringcheck4;
    static String stringcheck5;

    @BeforeClass
    public  static void inizializzazione(){
        stringcheck = "-3";
        stringcheck2 = "500";
        stringcheck3 = "-10";
        stringcheck4 = "32767";
        stringcheck5 = "-3";
    }


    @Test
    public void test_stringtoIntConverter(){
        assertEquals(-3,f.stringToIntConverter(stringcheck));
        assertEquals(500,f.stringToIntConverter(stringcheck2));
        assertEquals(-10,f.stringToIntConverter(stringcheck3));
        assertEquals(32767,f.stringToIntConverter(stringcheck4));
        assertEquals(-3,f.stringToIntConverter(stringcheck5));
    }


}