import java.io.*;
import java.util.*;
import java.lang.*;
class leap
{
public static void main(String[]args)
{
int year;
Scanner scan=new Scanner(System.in);
year=scan.nextInt();
if(year%4==0 || year%400==0)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
