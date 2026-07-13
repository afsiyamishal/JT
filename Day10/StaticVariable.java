package Day10;
public class StaticVariable {

    static int count = 0;

    StaticVariable() {
        count++;
    }

    public static void main(String[] args) {

        new StaticVariable();
        new StaticVariable();
        new StaticVariable();

        System.out.println("Objects Created: " + count);

    }
}