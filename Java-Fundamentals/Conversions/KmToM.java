import java.util.Scanner;

/*
 Program: Convert Kilometer to Meter
 Author: Dhaneshwari Ghewari
*/

class KmToM
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Kilometer: ");
        int iNo = sobj.nextInt();

        int iResult = iNo * 1000;

        System.out.println("Meter is: " + fResult);

        sobj.close();
    }
}