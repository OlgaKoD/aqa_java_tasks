import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

        @Parameters({"name"})
        @Test
        public void checkPrintName3(String n) {
            String actual = task.printName(n);
            int linesActual;
            int columnsActual;

            String[] splittedLines = actual.split(System.lineSeparator());
            linesActual = splittedLines.length;

            String[] splittedColumns = splittedLines[0].split(" ");
            columnsActual = splittedColumns.length;
            assertTrue((linesActual == 5 && columnsActual == 10), String.format("Expected 5 lines and 10 columns, but received %d lines and %d columns", linesActual, columnsActual));
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

