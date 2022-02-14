public class FiniteSet {

    private int[] elements;
    private int n;

    public FiniteSet() {
        n = 0;
    }

    public FiniteSet(int ... a) {
        n = 0;
        for (int element : a) {
            add(element);
        }
    }

    public static FiniteSet getDifference(FiniteSet set1, FiniteSet set2) {
        FiniteSet set = new FiniteSet();
        for (int i = 0; i < set1.getN(); i++) {
            for (int j = 0; j < set2.getN(); j++) {
                if (set1.getElement(i) == set2.getElement(j)) {
                    set.add(set1.getElement(i));
                }
            }
        }
        return set;
    }

    public int getN() {
        return n;
    }

    public int getElement(int i) {
        return elements[i];
    }

    public void add(int element) {
        for (int i = 0; i < n; i++) {
            if (elements[i] == element) {
                return;
            }
        }

        n++;
        int[] newElements = new int[n];

        for (int i = 0; i < n-1; i++) {
            newElements[i] = elements[i];
        }

        newElements[n-1] = element;

        // free(elements) :)

        elements = newElements;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("{");
        for (int i = 0; i < n-1; i++) {
            str.append(elements[i]).append(", ");
        }
        if (n != 0) {
            str.append(elements[n-1]);
        } else {
            str.append("null");
        }
        str.append("}");

        return str.toString();
    }
}
