import java.util.Scanner;
class pattern
{
    public static void main(String[] args)
    {

        System.out.println("Enter number = ");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();

        int i,j;

        for(i=1;i<=n;i++)
        {
            //c="1";
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
                //c+=2;
            }
            System.out.print("\n");
        }
    }
}