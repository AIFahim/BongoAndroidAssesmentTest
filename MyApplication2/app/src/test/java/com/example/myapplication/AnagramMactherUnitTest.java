package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AnagramMactherUnitTest {
    @Test
    public void AnagramCheck()  throws  Exception{
        AnagramMacther utils = new AnagramMacther();
       // assertTrue(!utils.isValidEmailAddress("foo@bar.com"));
        assertTrue(utils.AnagramChecker("abcc","abca"));
    }
}