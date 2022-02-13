public class Test {
    public static void main(String[] args) {
        Polynomial polynomial1 = new Polynomial(1, -2, 1);
        Polynomial polynomial2 = new Polynomial(4, 0, 5, -1);
        System.out.println(polynomial1);
        System.out.println(polynomial2);
        System.out.println(polynomial1.calculateAtPoint(4));
        System.out.println(polynomial2.calculateAtPoint(3));
    }
}
