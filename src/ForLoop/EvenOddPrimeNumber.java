package ForLoop;

public class EvenOddPrimeNumber {

    public static void printPrimeNumber(int x)
    {
        // for even prime number;
        while(x % 2 == 0)
        {
            System.out.print(2 + " ");
            x /=2;
        }

        //for odd  prime number
        for(int i = 3; i <= Math.sqrt(x); i +=2)
        {
            while (x % i == 0)
            {
                System.out.print(i + " ");
                x /= i;
            }
        }
        if(x > 2) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int i = 315 ;
        printPrimeNumber(i);
    }
}
