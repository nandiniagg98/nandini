import java.util.*;
class que5
{
public static int[] reverse1(int n,int[] arr)
{
for(int i=0;i<n/2;i++)
{
int temp=arr[n-1-i];
arr[n-1-i]=arr[i];
arr[i]=temp;
}
return arr;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int rev[]=reverse1(n,arr);
for(int i=0;i<n;i++)
{
System.out.println(rev[i]);
}
}
}