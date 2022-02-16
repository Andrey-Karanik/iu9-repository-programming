public class Triangle implements Comparable<Triangle>{

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSquare() {
        double p = (a+b+c) / 2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public int compareTo(Triangle o) {
        if (getSquare() > o.getSquare()) {
            return 1;
        } else if (getSquare() == o.getSquare()) {
            return 0;
        } else {
            return -1;
        }
    }
}
