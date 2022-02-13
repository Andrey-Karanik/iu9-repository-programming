import java.lang.Math;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        setValue(realPart, imaginaryPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setValue(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public static ComplexNumber getSum(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getRealPart() + num2.getRealPart(), num1.getImaginaryPart() + num2.getImaginaryPart());
    }

    public static ComplexNumber getDifference(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getRealPart() - num2.getRealPart(), num1.getImaginaryPart() - num2.getImaginaryPart());
    }

    public static ComplexNumber getProduct(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getRealPart() * num2.getRealPart() - num1.getImaginaryPart() * num2.getImaginaryPart(),
                num1.getRealPart() * num2.getImaginaryPart() + num1.getImaginaryPart() * num2.getRealPart());
    }

    public static ComplexNumber getQuotient(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber((num1.getRealPart() * num2.getRealPart() + num1.getImaginaryPart() * num2.getImaginaryPart())
                / (Math.pow(num2.getRealPart(), 2) + Math.pow(num2.getImaginaryPart(), 2)),
                (num1.getImaginaryPart() * num2.getRealPart() - num1.getRealPart() * num2.getImaginaryPart())
                        / (Math.pow(num2.getRealPart(), 2) + Math.pow(num2.getImaginaryPart(), 2)));
    }

    public String toString() {
        String str = "";

        str += realPart;
        if (imaginaryPart != 0) {
            str += imaginaryPart > 0 ? " + " : " - ";
            str += Math.abs(imaginaryPart) + "*i";
        }

        return str;
    }
}
