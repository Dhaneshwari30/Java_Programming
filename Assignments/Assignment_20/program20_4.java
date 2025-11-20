//4. Write a program to find the largest digit in a given number

class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0, iMax = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iMax < iDigit)
            {
                iMax = iDigit;
            }
            num = num / 10;
        }
        System.out.println(iMax + " is the largest number");
    }
}

class program20_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(93428);
    }
}