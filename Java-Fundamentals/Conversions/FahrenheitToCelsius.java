import java.util.Scanner;

/*
 Program: Convert Fahrenheit to Celsius 
 Author: Dhaneshwari Ghewari
*/

class FahrenheitToCelsius
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double iNo = sobj.nextDouble();

        Double iResult = (iNo - 32)/1.8;

        System.out.println("Celsius is: " + iResult);

        sobj.close();
    }
}