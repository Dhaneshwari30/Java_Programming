//Print all the even numbers upto N

import java.util.*;

class Assignment13_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 0; i <= iNo; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}