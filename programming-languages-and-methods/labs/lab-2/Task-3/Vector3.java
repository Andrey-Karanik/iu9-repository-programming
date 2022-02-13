public class Vector3 {

    private int x;
    private int y;
    private int z;

    public Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3 multiply(Vector3 vector3) {
        Vector3 vector = new Vector3(0, 0, 0);
        vector.setX(y * vector3.getZ() - vector3.getY() * z);
        vector.setY(-(x * vector3.getZ() - vector3.getX() * z));
        vector.setZ(x * vector3.getY() - vector3.getX() * y);
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
