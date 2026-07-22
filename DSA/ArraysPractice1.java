import java.util.*;

public class ArraysPractice1
{
    public static void main(String[] args)
    {
        int arr[] = {5,2,8,1,9};

        //Convert Array to string and display the array without using loop
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};

        //using == operator
        System.out.println(arr1==arr2);

        //Using equals
        System.out.println(Arrays.equals(arr1,arr2));

        int marks[] = new int[5];

        //Fill
        Arrays.fill(marks,100);

        System.out.println(Arrays.toString(marks));


    }
}