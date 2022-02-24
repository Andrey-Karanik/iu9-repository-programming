import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        CProgram[] cPrograms = new CProgram[] {
                new CProgram(
                        """
                        int a = 0;
                        int b = 0;
                        //good
                        int c = 2*a + b; //a + a + b
                        /*hello
                        wor
                        ld*/
                        """),
                new CProgram(
                        """
                        int a = 25;
                        """),
                new CProgram(
                        """
                        int a = 5;
                        int b = 5;
                        int c = a * b; //25
                        """),

        };
        Arrays.sort(cPrograms);
        for (CProgram cProgram : cPrograms) {
            System.out.println(cProgram);
        }
    }
}
