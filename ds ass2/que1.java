import java.util.Scanner;
class palindrome
{
public static String reverse(String str)
{
String rev="";
int len=str.length();
for(int i=lrn-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
return rev;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String revstr=reverse(str);
if(str.equals(revstr))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}