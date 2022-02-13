import java.lang.Math;

public class Polynomial {

    private final int[] k;

    public Polynomial(int ... k) {
        this.k = k;
    }

    public int calculateAtPoint(int x) {
        int sum = 0;
        for (int i = 0; i < k.length; i++) {
            sum += k[i] * Math.pow(x, (k.length - 1 - i));
        }
        return sum;
    }

    private String getPrettyText(int value, int index) {
        String str = "";

        if (value != 0) {
            if (index != 0) {
                str += value > 0 ? " + " : " - ";
            }

            if (value == 1) {
                str += "x";
            } else {
                str += Math.abs(value) + "x";
            }

            if (index != k.length - 2) {
                str += "^" + (k.length - 1 - index);
            }
        }

        return str;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < k.length-2; i++) {
            str.append(getPrettyText(k[i], i));
        }

        if (k.length > 1) {
            str.append(getPrettyText(k[k.length - 2], k.length - 2));
        }

        if (k[k.length-1] != 0) {
            str.append(k[k.length - 1] > 0 ? " + " : " - ");
            str.append(Math.abs(k[k.length - 1]));
        }

        return str.toString();
    }
}
