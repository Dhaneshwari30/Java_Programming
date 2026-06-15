import java.util.Scanner;

/*
 Program: Convert Meter to Kilometer
 Author: Dhaneshwari Ghewari
*/

class KmToM
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Meter: ");
        int iNo = sobj.nextInt();

        float fResult = (float)iNo / (float)1000;

        System.out.println("KiloMeter is: " + fResult);

        sobj.close();
    }
}