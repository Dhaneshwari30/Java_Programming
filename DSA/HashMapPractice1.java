import java.util.*;

public class HashMapPractice1
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("Apple",120);
        map.put("Banana",40);
        map.put("Mango",80);
        map.put("Orange",60);
        map.put("Grapes",90);

        //Print
        System.out.println(map);

        //Print particular amount
        System.out.println(map.get("Mango"));

        System.out.println("Weather Banana exists: "+map.containsKey("Banana"));

        System.out.println("Check weather price 200 exists: "+ map.containsValue(200));

        //update value

        map.replace("Apple", 150);

        //to remove 
        map.remove("Orange");

        //Display only keys
        System.out.println(map.keySet());

        //Display only values
        System.out.println(map.values());

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        map.put(map.get("Mango"),map.getOrDefault(map.get("Mango"), 0)+10);

    }
}