//4. Write a program to find the sum of even and odd digits separately in a number

class Logic
{
    void sumEvenOddDigits(int n)
    {
       int iDigit = 0, iEvenSum = 0, iOddSum = 0;
       
       while(n != 0)
       {
            iDigit = n % 10;
            if((iDigit % 2) == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }
            n = n / 10;
       }

       System.out.println("Sum of even and odd digits is: " + (iEvenSum+iOddSum));
    }
}

class program18_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}