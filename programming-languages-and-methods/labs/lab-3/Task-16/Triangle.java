public class Triangle implements Comparable<Triangle>{

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        try {
            if (a + b < c) {
                throw new Exception("Треугольник со сторонами " + a + ", " + b + ", " + c + " построить нельзя, т.к. a + b < c");
            } else if (a + c < b) {
                throw new Exception("Треугольник со сторонами " + a + ", " + b + ", " + c + " построить нельзя, т.к. a + c < b");
            } else if (b + c < a) {
                throw new Exception("Треугольник со сторонами " + a + ", " + b + ", " + c + " построить нельзя, т.к. b + c < a");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            System.exit(1);
        }
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
        return Double.compare(getSquare(), o.getSquare());
    }
}
