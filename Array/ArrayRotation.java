import java.util.*;

class Solution
{
    public int[] Rotate(int[] arr, int t)
    {
        int i = 0;
        int j = 0;
        int temp = 0;

        for(i = 1 ; i <= t; i++)
        {
            temp = arr[0];
            for(j = 0; j < arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }

        return arr;
    }
}

class ArrayRotation
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of value :");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the times of rotation: ");
        int rotation = sobj.nextInt();

        Solution obj = new Solution();

        int Result[] = obj.Rotate(arr,rotation);

        for(int i = 0; i < Result.length; i++)
        {
            System.out.print(Result[i]+" ");
        }

        sobj.close();
    }
}