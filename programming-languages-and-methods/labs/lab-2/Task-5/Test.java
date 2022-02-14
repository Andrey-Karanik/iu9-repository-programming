public class Test {
    public static void main(String[] args) {
        FiniteSet finiteSet1 = new FiniteSet(1, 2, 2, 6, 4, 4, 4, 0);
        FiniteSet finiteSet2 = new FiniteSet();
        FiniteSet finiteSet3 = new FiniteSet(2, 4, 5);
        System.out.println(finiteSet1);
        System.out.println(finiteSet2);
        System.out.println(finiteSet3);
        System.out.println(FiniteSet.getDifference(finiteSet1, finiteSet3));
    }
}
