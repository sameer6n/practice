package Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrappedWaterTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void trap() {
        TrappedWater trappedWater = new TrappedWater();
        int [] array  = new int[]{0, 1, 0, 6, 1, 0, 1, 6, 2, 1, 2, 1};
        int ans = trappedWater.trap(array);

        assertEquals(18,ans);


    }
}