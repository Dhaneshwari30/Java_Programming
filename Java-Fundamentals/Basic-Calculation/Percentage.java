import java.util.Scanner;

/*
 Program: Calculate Percentage
 Author: Dhaneshwari Ghewari
 Description: Accepts number from the user and displays its Percentage.
*/

class Cube
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int iNo = sobj.nextInt();

        System.out.print("Enter Out-off: ");
        int Total = sobj.nextInt();

        float fResult = ((float)iNo/100) * (float)Total;

        System.out.println("Percentage is: " + fResult);

        sobj.close();
    }
}