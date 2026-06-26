//Print all the number from 1 to N

import java.util.*;

class Assignment13_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 0; i <= iNo; i++)
        {
            System.out.println(i);
        }
    }
}
