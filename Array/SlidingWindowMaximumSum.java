import java.util.*;

class Solution
{
    public int Max(int arr[])
    {
        int k = 2;

        int iSum = 0;

        for(int i = 0; i < k; i++)
        {
            iSum = iSum + arr[i];
        }
        int iMax = iSum;

        for(int i = k; i < arr.length; i++)
        {
            iSum = iSum - arr[i-k] + arr[i];

            if(iSum > iMax)
            {
                iMax = iSum;
            }
        }
        return iMax;

    }
}

class SlidingWindowMaximumSum
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