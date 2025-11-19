//1.Write a program to check whether a number is prime or not

class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 2; iCnt < num/2; iCnt++)
        {
            if((num % iCnt) == 0)
            {
                bFlag = true;
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is a not prime number");
        }
    }
}
class program18_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
