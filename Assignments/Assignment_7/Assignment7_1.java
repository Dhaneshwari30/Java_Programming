//Print $* as per the number given by user

import java.util.*;

class Assignment7_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        for(int i = 0; i < iNo; i++)
        {
            System.out.print("$*\t");
        }
    }
}
