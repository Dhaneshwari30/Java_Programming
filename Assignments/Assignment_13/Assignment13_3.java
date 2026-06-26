////Print all the odd numbers upto N

import java.util.*;

class Assignment13_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 0; i <= iNo; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}