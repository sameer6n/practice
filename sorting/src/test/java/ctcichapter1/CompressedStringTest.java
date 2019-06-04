package ctcichapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompressedStringTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void getCompressedStringTest(){
        CompressedString compressedString = new CompressedString();
        assertEquals("a2b1c4a3",compressedString.getCompressedString("aabccccaaa"));
        assertEquals("aabcca",compressedString.getCompressedString("aabcca"));
        assertEquals("a2",compressedString.getCompressedString("aa"));
    }
}