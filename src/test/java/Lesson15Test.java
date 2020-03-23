import org.junit.*;
import static org.junit.Assert.*;

//Commit-master-3: Нужно добавить еще тестов
public class Lesson15Test {
    private class TestPair {
        TestPair (int input_data, int expected_result) {
            this.input_data = input_data;
            this.expected_result = expected_result;
        }
        public int input_data = 0;
        public int expected_result = 0;
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void lilliesCount() {
        TestPair testPairs[] = {
                    new TestPair(1, 1),
                    new TestPair(4, 8),
                    //new TestPair(0, 1),
                    //new TestPair(-10, 1),
                    //new TestPair(31, 1073741824),
                    //new TestPair(32, 1073741824),
                    //new TestPair(55, 1073741824)
                                };

        for (int i = 0; i < testPairs.length; ++i) {
            int actual_result = Lesson15.lilliesCount(testPairs[i].input_data);
            assertEquals(testPairs[i].expected_result, actual_result);
        }

        /*
        int input_data[] =      {1, 4, 0, -10,         31,         32,         55};
        int expected_result[] = {1, 8, 1,   1, 1073741824, 1073741824, 1073741824};

        for (int i = 0; i < input_data.length; ++i) {
            int actual_result = Lesson15.lilliesCount(input_data[i]);

            assertEquals(expected_result[i], actual_result);
        }
        */

    }

    @Test
    public void daysCount() {
        TestPair testPairs[] = {
                new TestPair(100, 7),
                new TestPair(1073741824, 30),
                new TestPair(2000000000, 31),
        };

        for (int i = 0; i < testPairs.length; ++i) {
            int actual_result = Lesson15.daysCount(testPairs[i].input_data);
            assertEquals(testPairs[i].expected_result, actual_result);
        }
    }
}
