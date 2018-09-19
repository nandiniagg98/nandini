import java.util.Scanner;
class que2
{
public staic String toggle(String str)
{
String toggled="";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(Character.isUpperCase(ch))
{
ch=Character.toLowerCase(ch);
toggled=toggled+ch;
}
else if(Character.isLowerCase(ch))
{
ch=Character.toUpperCase(ch);
toggled=toggled+ch;
}
}
return toggled;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String str1=toggle(str);
System.out.println(str1);
}
}