//Accept 2 numbers and check weather its equal or not

import java.util.*;

class Assignment6_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second value: ");
        int iNo2 = sobj.nextInt();

        if(iNo1 == iNo2)
        {
            System.out.println("they are equal");
        }
        else
        {
            System.out.println("they are not equal");
        }
    }
}