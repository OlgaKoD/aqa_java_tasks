import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestTask15 {

    lesson1.Task5 task;
    @BeforeMethod
    public void setUp() {task = new lesson1.Task5();};

    @Test(dataProvider = "greeting")
    public void checkReverse(String g, String expected) {
        String actual = task.reverse(g);
        assertEquals(actual, expected,
                String.format("Expected %s to be equal %s", expected, actual));

    }

    @Parameters({"greeting", "expected3"})
    @Test
    public void checkReverse2(String g, String expected) {
        String actual = task.reverse(g);
        assertEquals(actual, expected,
                String.format("Expected %s to be equal %s", expected, actual));

    }


    @DataProvider(name = "greeting")
    public Object[][] provider() {
        return new Object[][]{
                {"Hello", "olleH"},
                {"world", "dlrow"},
                {"!)", ")!" },


        };
    }

}
