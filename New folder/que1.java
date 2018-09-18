import java.util.*;
class que1
{
public static int max(int n,int[] arr)
{
int l=arr[0];
for(int i=0;i<n;i++)
{
  if(l<arr[i])
{
int temp=l;
l=arr[i];
arr[i]=temp;
}
}
return l;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(int j=0;j<n;j++)
{
arr[j]=sc.nextInt();
}
int large=max(n,arr);
System.out.println(large);
}
}