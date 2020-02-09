import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestTask12 {

        lesson1.Task2 task;
        @BeforeMethod
        public void setUp() {task = new lesson1.Task2();};

        @Test(dataProvider = "names")
        public void checkPrintName(String n, String expected) {
            String actual = task.printName(n);
            assertEquals(actual, expected, String.format("Expected %s to be equal %s", expected, actual));

        }

        @Parameters({ "name", "expected2"})
        @Test
        public void checkPrintName2(String n, String expected) {
            String actual = task.printName(n);
            assertEquals(actual, expected, String.format("Expected %s to be equal %s", expected, actual));

        }


        @DataProvider(name = "names")
        public Object[][] provider() {
            return new Object[][]{
                    {"Olha", "Olha Olha Olha Olha Olha Olha Olha Olha Olha Olha" + System.lineSeparator() +
                            "Olha Olha Olha Olha Olha Olha Olha Olha Olha Olha" + System.lineSeparator() +
                            "Olha Olha Olha Olha Olha Olha Olha Olha Olha Olha" + System.lineSeparator() +
                            "Olha Olha Olha Olha Olha Olha Olha Olha Olha Olha" + System.lineSeparator() +
                            "Olha Olha Olha Olha Olha Olha Olha Olha Olha Olha" + System.lineSeparator()},
                    {"Hello", "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello" + System.lineSeparator() +
                            "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello" + System.lineSeparator() +
                            "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello" + System.lineSeparator() +
                            "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello" + System.lineSeparator() +
                            "Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello" + System.lineSeparator()},
                    {"Life", "LifeLifeLifeLifeLifeLifeLifeLifeLifeLife" + System.lineSeparator() +
                            "LifeLifeLifeLifeLifeLifeLifeLifeLifeLife" + System.lineSeparator() +
                            "LifeLifeLifeLifeLifeLifeLifeLifeLifeLife" + System.lineSeparator() +
                            "LifeLifeLifeLifeLifeLifeLifeLifeLifeLife" + System.lineSeparator() +
                            "LifeLifeLifeLifeLifeLifeLifeLifeLifeLife" + System.lineSeparator()}

            };
        }

    }

