import java.util.*;

public class ArrayListPractice1
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        //Insert
        list.add("Rahul");
        list.add("Priya");
        list.add("Amit");
        list.add("Sneha");
        list.add("Rohit");

        //Display with help on idex
        System.out.println(list.get(2));

        //Update 
        list.set(3,"Neha");

        //Display list
        System.out.println(list);

        //Remove value
        list.remove(1);

        //Check if value present
        System.out.println("Check rahul is: "+list.contains("Rahul"));

        //Array List size
        System.out.println("Size of Array list: "+list.size());

        //Display list using loop
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}