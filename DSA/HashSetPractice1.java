import java.util.*;

public class HashSetPractice1
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(50);

        //Check if value exist
        System.out.println("Check 30: "+set.contains(30));

        System.out.println("Check 100: "+set.contains(100));

        //Remove a value
        set.remove(20);

        //Size of Set
        System.out.println(set.size());

        //Check if set is empty or not
        System.out.println("is set empty: "+set.isEmpty());

        //Display set using loop
        for(Integer value : set)
        {
            System.out.println(value);
        }
    }
}