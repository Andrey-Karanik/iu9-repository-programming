public class Test {
    public static void main(String[] args) {
        PointSequence pointSequence = new PointSequence(new Point(1, 1, 1),
                new Point(1, 3, 5), new Point(2, 4, 8));
        System.out.println(pointSequence);
        for (double segmentLength : pointSequence) {
            System.out.print(segmentLength + " ");
        }
    }
}
