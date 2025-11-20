//5. Write a program to find the smallest digit in a given number

class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0, iMin = 9;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iMin > iDigit)
            {
                iMin = iDigit;
            }
            num = num / 10;
        }
        System.out.println(iMin + " is the smallest number");
    }
}

class program20_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}