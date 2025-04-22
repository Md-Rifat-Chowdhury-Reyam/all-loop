package WhileLoop;

public class sumWhile {
    public static void main(String[] args) {
        int i = 0;

        int sum = 0;

        while (i <= 10)
        {
            sum = sum + i ;
            i++;
        }
        System.out.println("sum : " + sum );
    }
}
