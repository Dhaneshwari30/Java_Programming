import java.util.*;

class Solution
{
    public void Sum(int arr[], int target)
    {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i = 0; i <arr.length; i++)
        {
            int value = target - arr[i];

            if(map.containsKey(value))
            {
                System.out.println(map.get(value)+" "+i);
            }

            map.put(arr[i],i);
        }
    }
}
class TwoSumHashMap
{
    public static void main(String A[])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter the number of value: ");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sobj.nextInt();

        Solution obj = new Solution();

        obj.Sum(arr, target);

    }
}