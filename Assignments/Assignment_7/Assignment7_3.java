//Accept a number and print the number line 

import java.util.*;

class Assignment7_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        for(int i = -iNo; i <= iNo; i++)
        {
            System.out.print(i+"\t");
        }
    }
}