import java.util.*;
class que4
{
public static int[] printwave(int n,int m,int[][] arr)
{
int i,j;
int arr1[]=new int[m*n];
int k=0;
for(i=0;i<m;i++)
{
if(i%2==0)
{
for(j=0;j<n;j++)
{
  arr1[k]=arr[i][j];
     k++;
}
}
else
{
for(j=n-1;j>=0;j--)
{
 arr1[k]=arr[i][j];
     k++;
}
}
}
return arr1;
}
public static void main(String args[])
{
int n,m;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
n=sc.nextInt();
int arr[][]=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}
}
 int wave[]=printwave(m,n,arr);
for(int i=0;i<m*n;i++)
{
System.out.println(wave[i]);
}
}
}