public class VectorN {

    private final int[] coordinates;

    public VectorN(int ... x) {
        coordinates = x;
    }

    public int multiply(VectorN vectorN) {
        int sum = 0;

        for (int i = 0; i < coordinates.length; i++) {
            sum += coordinates[i] * vectorN.getX(i);
        }

        return sum;
    }

    public int getX(int i) {
        return coordinates[i];
    }

    public void setX(int i, int value) {
        coordinates[i] = value;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("{");
        for (int i = 0; i < coordinates.length; i++) {
            str.append("x").append(i + 1).append(": ").append(coordinates[i]);
            if (i == coordinates.length - 1) {
                break;
            }
            str.append(", ");
        }
        str.append("}");

        return str.toString();
    }
}
