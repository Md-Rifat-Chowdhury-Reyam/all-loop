package DoWhileLoop;

public class WithoutCurlyBraces {

    public static void main(String[] args) {
        int i = 0;

        do
            System.out.println("I am do while loop");


        // there is no curly braces and update so print one time the statement; for this condition;
        while (i >= 4);

        // if use while(i <= 4); the statement will print infinite;
    }
}
