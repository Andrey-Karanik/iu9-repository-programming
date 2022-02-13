public class Test {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(0, 0);
        ComplexNumber complexNumber2 = new ComplexNumber(-3, 5);
        ComplexNumber complexNumber3 = new ComplexNumber(1, -2);
        System.out.println(complexNumber1);
        System.out.println(complexNumber2);
        System.out.println(complexNumber3);
        System.out.println(ComplexNumber.getSum(complexNumber2, complexNumber3));
        System.out.println(ComplexNumber.getDifference(complexNumber2, complexNumber3));
        System.out.println(ComplexNumber.getProduct(complexNumber2, complexNumber3));
        System.out.println(ComplexNumber.getQuotient(complexNumber2, complexNumber3));
    }
}
