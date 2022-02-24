import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        IntegerSequence[] sequences = new IntegerSequence[] {
                new IntegerSequence(1, 2, 6),
                new IntegerSequence(3, 4, 4, -2),
                new IntegerSequence(-1, -2, 0, 5, -13),
                new IntegerSequence(5),
                new IntegerSequence(6, 6, 6)
        };
        Arrays.sort(sequences);
        for (IntegerSequence sequence : sequences) {
            System.out.println(sequence);
        }
    }
}
