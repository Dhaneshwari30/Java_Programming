//Convert square feet to square meter

import java.util.*;

class Assignment10_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Square feet value: ");
        int iNo = sobj.nextInt();

        float fSqM = (float) iNo * (float)0.0929;

        System.out.println("Square meter: "+fSqM);
    }
}