import java.util.Arrays;

public class CharSequence implements Comparable<CharSequence> {

    private final char[] sequence;

    public CharSequence(char ... sequence) {
        this.sequence = sequence;
    }

    public CharSequence(String string) {
        this.sequence = string.toCharArray();
    }

    public char[] getSequence() {
        return sequence;
    }

    @Override
    public int compareTo(CharSequence o) {
        int n = 0, m = 0;
        for (char s : sequence) {
            if (s == 'a') {
                n++;
            }
        }
        for (char s : o.getSequence()) {
            if (s == 'a') {
                m++;
            }
        }

        return Integer.compare(n, m);
    }

    @Override
    public String toString() {
        return Arrays.toString(sequence);
    }
}
