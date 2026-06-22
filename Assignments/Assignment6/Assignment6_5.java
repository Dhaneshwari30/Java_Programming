//Take obtained mark and total marks from user , calculate the percentage 

import java.util.*;

class Assignment6_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the obtained marks: ");
        int iMarks = sobj.nextInt();

        System.out.println("Enter the total marks: ");
        int iTotal = sobj.nextInt();

        float fPercentage = ((float)iMarks/(float)iTotal)*(float)100;

        System.out.println("Percentage obtained: "+fPercentage);
    }
}