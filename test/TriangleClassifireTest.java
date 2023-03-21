import Rikkei.academy.TriangleClassifire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleClassifireTest {
    @Test
    void triangleClassifier() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
        String result = TriangleClassifire.triangleClassifire(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifire.triangleClassifire(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String result = TriangleClassifire.triangleClassifire(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải tam giác";
        String result = TriangleClassifire.triangleClassifire(a,b,c);
        assertEquals(expected,result);
    }

}
