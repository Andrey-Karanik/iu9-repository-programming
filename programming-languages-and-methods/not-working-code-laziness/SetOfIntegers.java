import java.util.Iterator;

public class SetOfIntegers implements Iterable<Integer> {
    private int[] set;

    public SetOfIntegers() {set = new int[0];}

    public SetOfIntegers(int ... elements) {
        set = new int[0];
        for (int e : elements) {
            add(e);
        }
    }

    public void add(int element) {
        for (int e : set) {
            if (e == element) {
                return;
            }
        }
        int[] newSet = new int[set.length+1];
        System.arraycopy(set, 0, newSet, 0, set.length);
        newSet[set.length] = element;
        set = newSet;
    }

    public boolean contains(int element) {
        for (int e : set) {
            if (e == element) {
                return true;
            }
        }
        return false;
    }

    public int[] toArray() {
        return set.clone();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Integer> {

        private int cursor;

        private SetOfIntegers[] subsets;

        public Itr() {
            subsets = new SetOfIntegers[getFactorial(set.length) + 1];
            for (int i = 0; i < subsets.length; i++) {
                subsets[i] = new SetOfIntegers();
                int k = i;
                int j = 0;
                while (k > 0) {
                    if (k % 2 == 0) {
                        subsets[i].add(set[j]);
                    }
                    k /= 2;
                    j++;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < subsets.length;
        }

        @Override
        public Integer next() {
            return getSum(subsets[cursor++].toArray());
        }

        private int getSum(int[] a) {
            int sum = 0;
            for (int j : a) {
                sum += j;
            }
            return sum;
        }

        private int getFactorial(int n) {
            if (n <= 2) {
                return n;
            }
            return n * getFactorial(n - 1);
        }
    }
}
