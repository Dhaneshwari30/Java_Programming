import java.util.*;

class Solution
{
    public int[] Final(int[] arr)
    {

        int i = 0, j = 0;

        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        return arr;
    }
}
class MoveZeroToEnd
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of value :");
        int no = sobj.nextInt();

        int arr[] = new int[no];
        int iCount = 0;

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int Result[] = obj.Final(arr);

        for(int i = 0; i < Result.length; i++)
        {
            System.out.print(Result[i]+" ");
        }

        sobj.close();

        sobj.close();
    }
}
