import java.util.Scanner;
class leap
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.print("->Enter the year = ");
int yr=S.nextInt();
if(yr%4 == 0)
{
  if(yr%100 == 0)
    {
       if(yr%400 == 0)
	System.out.println(yr+" is a leap year.");
       else
	System.out.println(yr+" is not a leap year.");
    }
  else
  System.out.print(yr+" is a leap year.");
}
else
  System.out.println(yr+" is not a leap year.");
}
}