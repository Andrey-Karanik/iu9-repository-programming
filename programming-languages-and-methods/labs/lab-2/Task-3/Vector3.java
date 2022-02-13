public class Vector3 {

    private double x;
    private double y;
    private double z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector3 getVectorProduct(Vector3 vector1, Vector3 vector2) {
        Vector3 vector = new Vector3(0, 0, 0);
        vector.setX(vector1.getY() * vector2.getZ() - vector2.getY() * vector1.getZ());
        vector.setY(-(vector1.getX() * vector2.getZ() - vector2.getX() * vector1.getZ()));
        vector.setZ(vector1.getX() * vector2.getY() - vector2.getX() * vector1.getY());
        return vector;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double value) {
        x = value;
    }
    public void setY(double value) {
        y = value;
    }
    public void setZ(double value) {
        z = value;
    }

    public String toString() {
        return "{" + "x: " + x + ", " + "y: " + y + ", " + "z: " + z + "}";
    }
}
