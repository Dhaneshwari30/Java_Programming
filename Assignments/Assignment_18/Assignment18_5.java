/*
    Input: 8
    Output: 2 4 6 8 10 12 14 16
 */

import java.util.*;

class Assignment18_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo; i++)
        {
            System.out.print(2*i+"\t");
        }
    }
}