package ctcichapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnewayEditTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isOneEditTest(){
        OnewayEdit onewayEdit = new OnewayEdit();

        assertEquals(true,onewayEdit.isOneWayEdit("sameer","ameer"));
        assertEquals(false,onewayEdit.isOneWayEdit("sameer","imeer"));
    }
}