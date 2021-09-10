import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class monthlyCodeTest1 {
    monthlyCode1 mc1 = new monthlyCode1();

    @Test
    void dotProductTest1() {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int actual = mc1.dotProduct(a, b);
        assertEquals(actual, 3);
    }

    @Test
    void dotProductTest2() {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        int actual = mc1.dotProduct(a, b);
        assertEquals(actual, -2);
    }
}