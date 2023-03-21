package Rikkei.academy;

public class TriangleClassifire {
    public static String triangleClassifire(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c ) {
                return "tam giác đều";
            }
            if (a == b || b == c || c == a) {
                return "tam giác cân";
            }
            return "tam giác thường";

        } else {
            return "không phải tam giác";
        }
    }
}
