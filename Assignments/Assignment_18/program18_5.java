//5. Write a program to check whether a number is positive, negative or zero

class Logic
{
    void checkSign(int num)
    {
        if(num < 0)
        {
            System.out.println(num + " is a negative number");
        }
        else if(num == 0)
        {
            System.out.println(num + " is a zero");
        }
        else 
        {
            System.out.println(num + " is a positive number");
        }
    }
}

class program18_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}