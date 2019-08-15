public class TriangleType {
    public static String TriangleTypeTest(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && c + b > a
                    && a - c < b && b - c < a && a - b < c) {
                if (a == b && b == c) {
                    return "equilateral triangle";
                } else if (a == b || b == c || a == c) {
                    return "isosceles triangle";
                } else {
                    return "triangle";
                }
            } return "not the triangle";
        }
        return "not the triangle";
    }
}
