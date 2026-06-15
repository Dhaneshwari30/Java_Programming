import java.util.*;

class Solution
{
    public int iNo;

    public Solution(int A)
    {
        this.iNo = A;
    }

    public boolean Divisible()
    {
        if((this.iNo%5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment1_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number to check divisible by 5: ");
        int no = sobj.nextInt();

        Solution obj = new Solution(no);

        boolean Result = obj.Divisible();

        if(Result == true)
        {
            System.out.println(no+" is divisible by 5");
        }
        else
        {
            System.out.println(no+" is not divisible by 5");
        }
    }
}