//Accept a range from user and display all numbers in between that range

import java.util.*;

class Assignment11_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter starting value: ");
        int iStart = sobj.nextInt();

        System.out.println("Enter ending value: ");
        int iEnd = sobj.nextInt();

        for(int i = iStart; i <= iEnd; i++)
        {
            System.out.println(i);
        }
    }
}
