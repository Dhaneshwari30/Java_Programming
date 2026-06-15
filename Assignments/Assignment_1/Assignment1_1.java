import java.util.*;

class Solution
{
    public int iNo1;
    public int iNo2;

    public Solution(int A, int B)
    {
        this.iNo1 = A;
        this.iNo2 = B;
    }

    public int Division()
    {
        int ans = 0;

        ans = this.iNo1/this.iNo2;

        return ans;
    }
}

class Assignment1_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int no1 = sobj.nextInt();

        System.out.println("Enter the second number: ");
        int no2 = sobj.nextInt();

        Solution obj = new Solution(no1,no2);

        int Result = obj.Division();

        System.out.println(Result);
    }
}
