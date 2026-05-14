import java.util.*;

class Solution
{
    public int Min(int arr[])
    {
        int iMin = Integer.MAX_VALUE;
        int iSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            iSum = iSum + arr[i];

            if(iSum < iMin)
            {
                iMin = iSum;
            }

            if(iSum > 0)
            {
                iSum = 0;
            }
        }

        return iMin;
    }
}

class MinimumSubarraySum
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

        int Result  = obj.Min(arr);

        System.out.println(Result);
    }
}