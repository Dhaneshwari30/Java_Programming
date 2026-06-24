//Accept temperature in Fahrenheit and convert to celsius

import java.util.*;

class Assignment10_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entert the Fahrenheit: ");
        float fFr = sobj.nextFloat();

        int iC = ((int)fFr - 32) * 5/9;

        System.out.println("Celsius is: "+iC);
    }
}