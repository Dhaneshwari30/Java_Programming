//Accept number and print its factor in decreasing order

import java.util.*;

class Assignment4_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        for(int i = iNo/2; i >= 1; i--)
        {
            if((iNo%i) == 0)
            {
                System.out.println(i);
            }
        }
        sobj.close();
    }
}