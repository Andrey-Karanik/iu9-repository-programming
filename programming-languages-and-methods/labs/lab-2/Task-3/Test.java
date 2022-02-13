public class Test {
    public static void main(String[] args) {
        Vector3 vector1 = new Vector3(4, 0, 4);
        Vector3 vector2 = new Vector3(3, -5, 5);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println(Vector3.getVectorProduct(vector1, vector2));
    }
}
