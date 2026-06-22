//Accept a number and print till that number

import java.util.*;

class Assignment7_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo; i++)
        {
            System.out.print(i+"\t");
        }
    }
}