public class Main {
    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer(5);
        circularBuffer.put(11);
        circularBuffer.put(21);
        circularBuffer.put(44);
        circularBuffer.put(6);
        circularBuffer.put(78);
        circularBuffer.put(99);
        System.out.println(circularBuffer);

        for (Object obj : circularBuffer) {
            System.out.print(obj + " ");
        }
    }
}
