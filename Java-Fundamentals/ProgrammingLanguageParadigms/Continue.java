import java.util.*;

class Continue
{
    public static void main(String A[])
    {
        for(int i = 0; i < 10; i++)
        {
            if(i == 3)
            {
                continue;
            }

            System.out.println(i);
        }
    }
}