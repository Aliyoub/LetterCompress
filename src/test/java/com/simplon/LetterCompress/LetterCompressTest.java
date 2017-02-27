package com.simplon.LetterCompress;


/**
 * Unit test for simple LetterCompress.
 */

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class LetterCompressTest {
    LetterCompress letterCompress = new LetterCompress();

    @Test
    public void getLetterCompress() {
        String result = letterCompress.getLetterCompress("aaabb");
        assertEquals("a3b2", result);
    }

}