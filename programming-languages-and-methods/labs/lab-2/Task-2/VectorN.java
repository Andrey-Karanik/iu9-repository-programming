public class VectorN {

    private final double[] coordinates;

    public VectorN(double ... x) {
        coordinates = x;
    }

    public static int getScalarProduct(VectorN vector1, VectorN vector2) {
        int sum = 0;

        for (int i = 0; i < vector1.getN(); i++) {
            sum += vector1.getX(i) * vector2.getX(i);
        }

        return sum;
    }

    public int getN() {
        return coordinates.length;
    }

    public double getX(int i) {
        return coordinates[i];
    }

    public void setX(int i, double value) {
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
