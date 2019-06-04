package ctcichapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueStringTest {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isUniqueWithBooleanArray() {
        assertEquals(true,UniqueString.isUniqueWithBooleanArray("abcd"));
        assertEquals(false,UniqueString.isUniqueWithBooleanArray("aabb"));
    }
}