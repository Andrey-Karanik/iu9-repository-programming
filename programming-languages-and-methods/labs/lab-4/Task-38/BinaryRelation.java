import java.util.Iterator;

public class BinaryRelation implements Iterable<PairOfIntegers>{
    private final int setSize;
    private final int matrixSize;
    private final int[][] matrixElements;

    public BinaryRelation(int n) {
        setSize = n;
        matrixSize = (int)Math.pow(setSize, 2);
        matrixElements = new int[n][n];
    }

    public void initializeBooleanMatrix(int ... elements) {
        try {
            if (elements.length > matrixSize) {
                throw new Exception("You are out of the matrix.");
            } else if (elements.length < matrixSize) {
                throw new Exception("Too few elements.");
            }
            for (int i = 0; i < setSize; i++) {
                for (int j = 0; j < setSize; j++) {
                    if (elements[i * setSize + j] != 0 && elements[i * setSize + j] != 1) {
                        throw new Exception("Elements must take values either 0 or 1");
                    }
                    matrixElements[i][j] = elements[i * setSize + j];
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BinaryRelation (BooleanMatrix):\n");
        for (int i = 0; i < setSize; i++) {
            stringBuilder.append("( ");
            for (int j = 0; j < setSize; j++) {
                stringBuilder.append(matrixElements[i][j]).append(" ");
            }
            stringBuilder.append(")\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<PairOfIntegers> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<PairOfIntegers> {

        private int cursor;

        public Itr() {
            while (cursor < matrixSize && matrixElements[cursor / setSize][cursor % setSize] != 1) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < matrixSize;
        }

        @Override
        public PairOfIntegers next() {
            PairOfIntegers pair = new PairOfIntegers(cursor / setSize, cursor % setSize);
            cursor++;
            while (cursor < matrixSize && matrixElements[cursor / setSize][cursor % setSize] != 1) {
                cursor++;
            }
            return pair;
        }
    }
}
