public class Test {
    public static void main(String[] args) {
        VectorN vector1 = new VectorN(1, 2, 3);
        VectorN vector2 = new VectorN(5, 9, -5);
        VectorN vector3 = new VectorN(6, -6, 0, 5);
        VectorN vector4 = new VectorN(4, 2, 1, 9);
        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println(vector3.toString());
        System.out.println(vector4.toString());
        System.out.println(vector1.multiply(vector2));
        System.out.println(vector3.multiply(vector4));
    }
}
