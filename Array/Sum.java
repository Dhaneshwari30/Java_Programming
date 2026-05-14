import java.util.*;

class Solution
{
    public int Add(int arr[])
    {
        int iTotal = 0;

        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for(int j = i; j < arr.length; j++)
            {
                sum = sum + arr[j];

                iTotal = iTotal + sum;
            }
        }

        return iTotal;
    }
}

class Sum
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

        int Result  = obj.Add(arr);

        System.out.println(Result);
    }
}