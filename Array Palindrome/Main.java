import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int temp_1[]=new int[n];
      int a=0;
      int temp_2[]=new int[n];
      int b=0;
      for(int i=0;i<n;i++)
      {
        temp_1[a]=arr[i];
        a++;
      }
      for(int j=(n-1);j>=0;j--)
      {
        temp_2[b]=arr[j];
        b++;
      }
    if(Arrays.equals(temp_1, temp_2))
     {
        System.out.println("Yes");
     }
    else
     {
        System.out.println("No");
     }
}
}