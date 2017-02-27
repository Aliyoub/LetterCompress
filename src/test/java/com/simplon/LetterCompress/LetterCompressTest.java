package com.simplon.LetterCompress;


/**
 * Unit test for simple LetterCompress.
 */

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class LetterCompressTest {
    LetterCompress letterCompress = new LetterCompress();

    @Test
    public void getLetterCompressTest() {
        // set
        String lettersTcompress = "aaabb";
        String result = letterCompress.getLetterCompress(lettersTcompress);
        assertEquals("a3b2", result);
    }

}