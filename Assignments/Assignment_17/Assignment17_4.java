//To check minimum of three numbers

import java.util.*;

class Assignment17_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second value: ");
        int iNo2 = sobj.nextInt();

        System.out.println("Enter third value: ");
        int iNo3 = sobj.nextInt();

        if(iNo1 < iNo2 && iNo1 < iNo3)
        {
            System.out.println(iNo1+ " is smallest");
        }
        else if(iNo2 < iNo1 && iNo2 < iNo3)
        {
            System.out.println(iNo2+" is smallest");
        }
        else if(iNo3 < iNo1 && iNo3 < iNo2)
        {
            System.out.println(iNo3+" is smallest");
        }
    }
}