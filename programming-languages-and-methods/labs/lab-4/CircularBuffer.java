import java.util.Arrays;
import java.util.Iterator;

public class CircularBuffer implements Iterable<Object>{
    private final Object[] buffer;
    private final int capacity;
    private int start;
    private int end;

    public CircularBuffer(int capacity) {
        buffer = new Object[capacity];
        this.capacity = capacity;
    }

    public void put(Object item) {
        buffer[end++] = item;
        end %= capacity;
    }

    public Object get() {
        Object item = buffer[start++];
        start %= capacity;
        return item;
    }

    public boolean isFullCapacity() {
        for (Object obj : buffer) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "CircularBuffer: " + Arrays.toString(buffer);
    }

    @Override
    public Iterator<Object> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Object> {
        private int pos;
        private int cursor;

        public Itr() {
            if (isFullCapacity()) {
                pos = end;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < capacity;
        }

        @Override
        public Object next() {
            return buffer[(pos + cursor++) % capacity];
        }
    }
}
