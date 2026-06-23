//Accept amount in us dollar and return its corresponding value in Indian currency
// Consider 1$ = 70 Rs

import java.util.*;

class Assignment9_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Amount in USdollar: ");
        int iNo = sobj.nextInt();

        int iRs = iNo * 70;

        System.out.println(iRs+"Rs");
    }
}