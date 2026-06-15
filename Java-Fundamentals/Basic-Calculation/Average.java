import java.util.Scanner;

/*
 Program: Average of Three Numbers
 Author: Dhaneshwari Ghewari
 Description: Accepts three numbers from the user and displays their Average.
*/

class Average
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int iNo1 = sobj.nextInt();

        System.out.print("Enter Second Number: ");
        int iNo2 = sobj.nextInt();

        System.out.print("Enter Third Number: ");
        int iNo3 = sobj.nextInt();

        int iSum = iNo1 + iNo2 + iNo3;

        float Result = (float)iSum / 3;

        System.out.println("Average is: " + iResult);

        sobj.close();
    }
}