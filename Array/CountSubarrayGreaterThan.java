import java.util.*;

class Solution
{
    public int Count(int arr[], int iSize, int iMax)
    {
        if(iSize > arr.length)
        {
            return 0;
        }

        int iCount = 0;

        int iSum = 0;

        for(int i = 0; i < iSize; i++)
        {
            iSum = iSum + arr[i];
        }

        if(iSum > iMax)
        {
            iCount++;
        }

        for(int i = iSize; i < arr.length; i++)
        {
            iSum = iSum - arr[i-iSize] + arr[i];

            if(iSum >= iMax)
            {
                iCount++;
            }
        }

        return iCount;
    }
}
class CountSubarrayGreaterThan
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

        System.out.println("Enter the size of array: ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the greater than sum value:");
        int iMax = sobj.nextInt();

        Solution obj = new Solution();

        int Result  = obj.Count(arr,iSize,iMax);

        System.out.println(Result);
    }
}