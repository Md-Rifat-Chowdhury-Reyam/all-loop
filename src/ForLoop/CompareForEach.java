package ForLoop;

import java.util.ArrayList;
import java.util.Calendar;

public class CompareForEach {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        long startTime ;
        long endTime ;
        int sizelist = list.size();

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

        startTime = Calendar.getInstance().getTimeInMillis();

        for (int i = 0; i < list.size(); i++)
        {
            int  a = list.get(i);
        }

        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("time take for loop: " + (endTime - startTime) + " ms");



        // Type 3: Calculating the collection size before the loop (already optimized)

        startTime = Calendar.getInstance().getTimeInMillis();

        for (int i = 0; i < sizelist; i++ )
        {
            int a = list.get(i);
        }
        endTime = Calendar.getInstance().getTimeInMillis();

        System.out.println("collection time " + ( endTime - startTime) + " ms");

        // Type 4: Iterating the list in reverse order

        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i = sizelist -1 ; i >= 0; i-- )
        {
            int a = list.get(i);
        }


        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("collection time " + ( endTime - startTime) + " ms");
    }


}
