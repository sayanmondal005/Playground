import java.util.*;
class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  int temp=0;
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
  int k=sc.nextInt();
  for(int i=0;i<n-1;i++)
  {
    int min=i;
    for(int j=i+1;j<n;j++)
    {
      if(arr[j]>arr[min])
      {
        min=j;
      }
    }
      temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
  }
    System.out.print(arr[k-1]+" ");
}
}