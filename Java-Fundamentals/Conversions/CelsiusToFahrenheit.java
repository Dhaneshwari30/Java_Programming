import java.util.Scanner;

/*
 Program: Convert Celsius to Fahrenheit
 Author: Dhaneshwari Ghewari
*/

class CelsiusToFahrenheit
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Celsius: ");
        int iNo = sobj.nextInt();

        float fResult = (float)iNo * (float)1.8;
        fResult += 32;

        System.out.println("Fahrenheit is: " + fResult);

        sobj.close();
    }
}
