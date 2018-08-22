import java.util.Scanner;
class prime
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the integer = ");
        int n=S.nextInt();
        int i;
        int flag=0;
        for(i=2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                flag=1;
                break;
            }
        }
        if(flag == 0)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
    }
}