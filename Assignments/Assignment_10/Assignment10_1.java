//Accpet radius of circle from user and calculate its area 
// Consider value of PI as 3.14

import java.util.*;

class Assignment10_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int iNo = sobj.nextInt();

        float fArea = (float)3.14 * ((float)iNo * (float)iNo);

        System.out.println("Area is: "+fArea);
    }
}
