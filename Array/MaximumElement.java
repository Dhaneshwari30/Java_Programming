import java.util.*;

class MaximumElement
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of value :");
        int no = sobj.nextInt();

        int arr[] = new int[no];
        int max = 0;

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}