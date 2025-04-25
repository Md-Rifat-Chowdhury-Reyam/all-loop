package ForLoop;

import java.util.ArrayList;
import java.util.Calendar;

public class CompareForEach {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        long startTime ;
        long endTime ;

        for (int i = 0; i <= 100000; i++)
        {
            list.add(i);
        }

        //Type 1: store integer values using for-each loop and count the time;
        startTime = Calendar.getInstance().getTimeInMillis();

        for (int i : list)
        {
            int a = i;
        }


        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For each: " + (endTime - startTime) +" ms");


        //Type 2: store integer values using for loop and count the time;
    }
}
