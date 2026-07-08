//iRow= 4, iCol = 3
/*
    * # *
    * # *
    * # *
    * # *
 */

import java.util.*;

class Assignment19_4
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
                if(j%2 == 0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}