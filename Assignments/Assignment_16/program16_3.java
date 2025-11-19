//3. Write a program to find the factorial of a number using a for loop

class Logic
{
    void findFactorial(int num)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println("Factorial of 5 is: "+ iSum);
    }
}

class program16_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}