import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthlyCodeTest1 {
    MonthlyCode1 mc1 = new MonthlyCode1();

    @Test
    void dotProductTest1() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int actual = mc1.dotProduct(a, b);
        assertEquals(actual, 3);
    }

    @Test
    void dotProductTest2() {
        int[] a = {-1, 0, 1};
        int[] b = {1, 0, -1};
        int actual = mc1.dotProduct(a, b);
        assertEquals(actual, -2);
    }

    @Test
    void numeralTest() {
        int actual = mc1.numeral(125);
        assertEquals(actual, 229);
    }

    @Test
    void binaryTest() {
        int[] actual = mc1.binary("110010101001");
        assertArrayEquals(new int[]{3, 8}, actual);
    }
}