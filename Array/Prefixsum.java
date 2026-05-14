import java.util.*;

class Solution
{
    public int[] Sum(int arr[])
    {
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }
}

class Prefixsum
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value:");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int Result[] = obj.Sum(arr);

        for(int i = 0; i <Result.length; i++)
        {
            System.out.print(Result[i]+ " ");
        }

        sobj.close();
    }
}