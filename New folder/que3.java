import java.util.*;
class que3
{
public static int[] intersection(int n,int[] arr,int[] arr1)
{
int k=0;
int arr3[]=new int[n];
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1-i;j++)
{
if(arr[j]>arr[j+1])
{
k=arr[j];
arr[j]=arr[j+1];
arr[j+1]=k;
}
if(arr1[j]>arr1[j+1])
{
k=arr1[j];
arr1[j]=arr1[j+1];
arr1[j+1]=k;
}
}
}
int i=0,j=0,m=0;
while(i<n&&j<n)
{
if(arr[i]==arr1[j]){
arr3[m]=arr[i];
i++;
j++;
m++;
}
else
{
if(arr[i]>arr1[j])
j++;
else
i++;
}
}
arr3[m]=-1;
return arr3;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
int arr1[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
arr1[i]=sc.nextInt();
}
int out[]=intersection(n,arr,arr1);
for(int i=0;out[i]!=-1;i++)
{
System.out.println(out[i]);
}
}
}