import java.util.Scanner;
class reverse
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the integer = ");
        int n=S.nextInt();
        int revnum=0;
        int remainder;
        while(n!=0)
        {
            remainder=n%10;
            revnum=revnum*10+remainder;
            n/=10;
        }
        System.out.println("Reversed number is = "+revnum);
    }
}