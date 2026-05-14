import java.util.*;

class Solution
{
    public int Max(int arr[])
    {
        int iMax = Integer.MIN_VALUE;
        int iSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            iSum = iSum + arr[i];

            if(iSum > iMax)
            {
                iMax = iSum;
            }

            if(iSum < 0)
            {
                iSum = 0;
            }
        }

        return iMax;
    }
}

class MaximumSubarrayBruteforce
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int Result  = obj.Max(arr);

        System.out.println(Result);
    }
}