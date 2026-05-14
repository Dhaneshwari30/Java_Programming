import java.util.*;

class Solution
{
    public int Sum(int arr[], int start, int end)
    {
        int add = 0;
        for(int i = start; i <= end; i++)
        {
            add = add+ arr[i];
        }

        return add;
    }
}
class FindIndices
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

        System.out.println("Enter the start index: ");
        int start = sobj.nextInt();

        System.out.println("Enter the end index: ");
        int end = sobj.nextInt();

        Solution obj = new Solution();

        int Result = obj.Sum(arr,start,end);

        System.out.println(Result);

    }
}