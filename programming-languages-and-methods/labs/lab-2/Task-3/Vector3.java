public class Vector3 {

    private int x;
    private int y;
    private int z;

    public Vector3(int x, int y, int z) {
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int value) {
        x = value;
    }
    public void setY(int value) {
        y = value;
    }
    public void setZ(int value) {
        z = value;
    }

    public String toString() {
        return "{" + "x: " + x + ", " + "y: " + y + ", " + "z: " + z + "}";
    }
}
