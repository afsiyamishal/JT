package Day12;

public class trycatch {
     public static void main(String[] args) {

        try {

            int a = 10 / 0;

            System.out.println(a);

        } catch (ArithmeticException e) {

            System.out.println("Cannot Divide by Zero");

        }

    }
    
}
