import java.util.*;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int missing_value=0;
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      for(int j=1;j<=n;j++)
      {
      int match=0;
      for(int i=0;i<n;i++)
      {
      if(arr[i]==j)
         {
             match=1;
         }
        }
      if(match==0)
         {
             missing_value=j;
         }
     }
      System.out.println(missing_value);
}
}