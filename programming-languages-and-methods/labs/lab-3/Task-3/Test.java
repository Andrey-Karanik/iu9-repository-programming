import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        CharSequence[] charSequences = new CharSequence[] {
                new CharSequence("abracadabra"),
                new CharSequence("work"),
                new CharSequence("alan")
        };
        Arrays.sort(charSequences);
        for (CharSequence s : charSequences) {
            System.out.println(s);
        }
    }
}
