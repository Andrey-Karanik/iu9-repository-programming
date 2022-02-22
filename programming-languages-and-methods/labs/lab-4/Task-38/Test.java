public class Test {
    public static void main(String[] args) {
        BinaryRelation binaryRelation = new BinaryRelation(3);
        binaryRelation.initializeBooleanMatrix(1, 0, 1,
                0, 1, 0,
                0, 1, 0);
        System.out.println(binaryRelation);
        for (PairOfIntegers pair : binaryRelation) {
            System.out.println(pair);
        }
    }
}
