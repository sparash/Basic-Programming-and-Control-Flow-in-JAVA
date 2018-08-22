import java.util.Scanner;
class palindrome
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int reverse=0;
        int remainder;
        int orig;
        orig=n;
        while(n!=0)
        {
            remainder = n%10;
            reverse = reverse*10+remainder;
            n=n/10;

        }
        if(orig==reverse)
        {
            System.out.println(orig+" it is palindrome number");
        }
        else
        {
            System.out.println(orig+" it is not palindrome number");
        }
    }
}