//iRow= 4, iCol = 3
/*
    1 2 3
    1 2 3
    1 2 3
    1 2 3
 */

import java.util.*;

class Assignment19_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Row value");
        int iRow = sobj.nextInt();

        System.out.println("Enter the Column value: ");
        int iCol = sobj.nextInt();

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}