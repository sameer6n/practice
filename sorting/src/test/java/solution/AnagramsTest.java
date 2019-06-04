package solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isAnagram() {
        Anagrams anagrams = new Anagrams();
        assertEquals(true,anagrams.isAnagram("sameer","eermas"));


    }
    @Test
    public void isAnagramFalseTest() {
        Anagrams anagrams = new Anagrams();
        assertEquals(false,anagrams.isAnagram("samee1","lam"));


    }

    @Test
    public void isAnagramsizeTest() {
        Anagrams anagrams = new Anagrams();
        assertEquals(false,anagrams.isAnagram("samee1","lam"));


    }




}