//Accept distance in kilometer and convert it into meter

import java.util.*;

class Assignment10_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entert the distance in kilometer: ");
        int iKM = sobj.nextInt();

        int iM = iKM * 1000;

        System.out.println("Distance in meter is: "+iM);
    }
}