package Day12;

public class ThrowException {

    public static void main(String[] args) {

        int marks = -10;

        try {

            if (marks < 0) {
                throw new ArithmeticException("Invalid Marks");
            }

            System.out.println(marks);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("Program Continues...");

    }
}