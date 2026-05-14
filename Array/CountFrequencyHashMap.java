import java.util.*;

class Solution
{
    public HashMap<Integer,Integer> Count(int arr[])
    {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        return map;
    }
}
class CountFrequencyHashMap
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

        HashMap<Integer,Integer> Result = obj.Count(arr);

        for(Map.Entry<Integer,Integer> entry:Result.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}