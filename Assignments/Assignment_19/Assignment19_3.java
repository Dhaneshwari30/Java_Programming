//iRow= 4, iCol = 3
/*
    3 2 1
    3 2 1
    3 2 1
    3 2 1
 */

import java.util.*;

class Assignment19_3
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
            for(int j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}