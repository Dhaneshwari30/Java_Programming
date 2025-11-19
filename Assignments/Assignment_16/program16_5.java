//5. Write a program to count the number of digits in a given number

class Logic
{
    void countDigits(int num)
    {
        int iDigit = 0, iCount = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iCount++;
            num = num / 10;
        }
        System.out.println("Number of digits is: "+ iCount);
    }
}

class program16_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}