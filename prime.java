class prime
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        count=false;
        for(int i=2;i<=num/2;++i)
        {
            if(num%i==0)
            {
                count=true;
                break;
            }
        }
        if(count!=true)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}