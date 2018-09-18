import java.util.*;
class que2
{
public static int[] bubblesort(int n,int[] arr)
{
for(int i=0;i<n;i++)
{
for(int j=0;j<n-1-i;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
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
int sorted[]=bubblesort(n,arr);
for(int i=0;i<n;i++)
{
System.out.println(sorted[i]);
}
}
}