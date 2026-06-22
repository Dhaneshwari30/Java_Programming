//Accept a number and print odd number till it

import java.util.*;

class Assignment7_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 0; i <= iNo; i++)
        {
            if((i%2) != 0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}