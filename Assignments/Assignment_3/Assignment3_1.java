//Accept one number and print that number of even numbers on screen

import java.util.*;

class Assignment3_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        for(int i = 0, j = 0 ; i < iNo; i++,j+=2)
        {
            System.out.println(j);
        }
    }
}
