import java.util.Arrays;
import java.util.Iterator;

public class PointSequence implements Iterable<Double> {
    private final Point[] points;

    public PointSequence(int n) {
        points = new Point[n];
    }

    public PointSequence(Point ... points) {
        this.points = points;
    }

    public void set(int index, int x, int y, int z) {
        points[index].setX(x);
        points[index].setY(y);
        points[index].setZ(z);
    }

    public void set(int index, Point point) {
        if (index >= points.length) {
            throw new ArrayIndexOutOfBoundsException("You are out of sequence. Your index: " + index +
                    ". Your sequence length: " + points.length);
        }
        points[index] = point;
    }

    public Point get(int index) {
        return points[index];
    }

    @Override
    public Iterator<Double> iterator() {
        return new Itr();
    }

    @Override
    public String toString() {
        return "PointSequence: " + Arrays.toString(points);
    }

    private class Itr implements Iterator<Double> {
        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < points.length - 1;
        }

        @Override
        public Double next() {
            double segmentLength = Math.sqrt(Math.pow(points[pos + 1].getX() - points[pos].getX(), 2) +
                    Math.pow(points[pos + 1].getY() - points[pos].getY(), 2) +
                    Math.pow(points[pos + 1].getZ() - points[pos].getZ(), 2));
            pos++;
            return segmentLength;
        }
    }
}
