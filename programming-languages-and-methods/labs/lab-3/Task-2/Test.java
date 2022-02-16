import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] integers = new Integer[15];
        for (int i = 0; i < 15; i++) {
            integers[i] = new Integer(i+1);
        }
        Arrays.sort(integers);
        for (int i = 0; i < 15; i++) {
            System.out.println(integers[i]);;
        }

    }
}
