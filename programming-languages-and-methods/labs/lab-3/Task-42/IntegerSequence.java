public class IntegerSequence implements Comparable<IntegerSequence> {

    private final int[] sequence;

    public IntegerSequence(int ... numbers) {
        sequence = numbers;
    }

    public int get(int index) {
        return sequence[index];
    }

    public void set(int index, int value) {
        sequence[index] = value;
    }

    public int[] toArray() {
        return sequence.clone();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sequence.length - 1; i++) {
            stringBuilder.append(sequence[i]).append(", ");
        }
        stringBuilder.append(sequence[sequence.length - 1]);
        return stringBuilder.toString();
    }

    @Override
    public int compareTo(IntegerSequence o) {
        int numberOfPrimes1 = 0, numberOfPrimes2 = 0;
        for (int number : sequence) {
            if (isPrime(number)) {
                numberOfPrimes1++;
            }
        }
        for (int number : o.toArray()) {
            if (isPrime(number)) {
                numberOfPrimes2++;
            }
        }

        return Integer.compare(numberOfPrimes1, numberOfPrimes2);
    }

    private boolean isPrime(int number) {
        if (Math.abs(number) == 1 || number == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(Math.abs(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
