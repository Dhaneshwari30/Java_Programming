/*
    Input: 5
    Output: 5 # 4 # 3 # 2 # 1 #
 */

import java.util.*;

class Assignment18_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        while(iNo != 0)
        {
            System.out.print(iNo+"\t#\t");
            iNo--;
        }
    }
}