//iRow= 4, iCol = 3
/*
    * * *
    * * *
    * * *
    * * *
 */

import java.util.*;

class Assignment19_1
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
            for(int j = 0; j < iCol; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
