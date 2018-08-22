import java.util.Scanner;
class largest
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=S.nextInt();
        int b=S.nextInt();
        int c=S.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is the greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
    }
}