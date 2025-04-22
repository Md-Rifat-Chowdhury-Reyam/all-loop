package ForLoop;

public class Nested1 {

    public static void print(int[][] mat)
    {
        //loop for all row;
        for (int i = 0; i < mat.length; i++)
        {
            //loop for all elements of a row;
            for(int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] mat = {{ 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }};

        print(mat);
    }


}
