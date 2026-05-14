import java.util.*;

class Solution
{
    int Sum(int[] brr, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int iCount = 0;
        int comp = 0;

        for(int i = 0; i < brr.length; i++)
        {
            comp = k - brr[i];
            if(map.containsKey(comp))
            {
                iCount++;
            }
            map.put(brr[i],i);
        }


        return iCount;
    }
}
class SubarraySum
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sobj.nextInt();

        Solution obj = new Solution();

        int Result = obj.Sum(arr, target);

        System.out.print(Result);
    }
}