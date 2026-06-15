import java.io.BufferedReader;
import java.util.Scanner;

/*
 Program: Input for user using BufferReader
 Author: Dhaneshwari Ghewari
*/

class KmToM
{
    public static void main(String args[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String st = bobj.readLine();

        System.out.println("Enter age:");
        int iAge = Integer.parseInt(bobj.readLine());

        System.out.println("Enter pointer: ");
        float fPointer = Float.parseFloat(st);
    }
}