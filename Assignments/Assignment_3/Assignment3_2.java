/* 2.Write a program which accpet number from user and print even factors of that number
    Input: 24
    Output:  2, 4, 6, 8, 12
*/

import java.util.*;

class Assignment3_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo/2; i++)
        {
            if((iNo%i) == 0 && ((i%2) == 0))
            {
                System.out.println(i);
            }
        }
    }
}