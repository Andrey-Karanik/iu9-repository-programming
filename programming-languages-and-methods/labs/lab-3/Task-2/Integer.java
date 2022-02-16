import java.util.Arrays;

public class Integer implements Comparable<Integer> {

    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Integer o) {
        String str1 = value + "";
        String str2 = o.toString();
        int m = Math.min(str1.length(), str2.length());
        int l = 0;
        for (int i = 0; i < m; i++) {
            if (Character.getNumericValue(str1.charAt(i)) != Character.getNumericValue(str2.charAt(i))) {
                l = i;
                break;
            }
        }
        return java.lang.Integer.compare(Character.getNumericValue(str1.charAt(l)), Character.getNumericValue(str2.charAt(l)));
    }

    @Override
    public String toString() {
        return value + "";
    }
}
