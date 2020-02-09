import lesson1.Task1;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestTask11 {
    Task1 task;
    @BeforeMethod
    public void setUp() {task = new Task1();};

    @Test(dataProvider = "numbers")
    public void checkMin1(int v1, int v2, int v3, int expected) {
        int actual = task.min(v1, v2, v3);
        assertEquals(actual, expected,
                String.format("Expected %d to be equal %d", expected, actual));

    }

    @Parameters({ "v1", "v2", "v3", "expected"})
    @Test
    public void checkMin2(int v1, int v2, int v3, int expected) {
        int actual = task.min(v1, v2, v3);
        assertEquals(actual, expected,
                String.format("Expected %d to be equal %d", expected, actual));

    }


    @DataProvider(name = "numbers")
    public Object[][] provider() {
        return new Object[][]{
                {1, 2, 3, 1},
                {3, 5, 6, 3},
                {0, 1, 3, 0},
                {-15, 15, 0, -15},

        };
    }

}
