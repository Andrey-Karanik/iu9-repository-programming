import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[] {
                new Triangle(3, 4, 5),
                new Triangle(2, 7, 8),
                new Triangle(4, 1, 4),
        };
        Arrays.sort(triangles);
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
    }
}
