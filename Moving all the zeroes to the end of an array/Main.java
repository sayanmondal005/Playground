import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
         arr[i]=sc.nextInt();
       }
       segregate(n,arr);
       for(int i=0;i<n;i++)
       {
         System.out.print(arr[i]+" ");
       }
    }
  public static int segregate(int n,int arr[])
  {
    int temp=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]!=0)
        arr[temp++]=arr[i];
    }
    while(temp<n)
        arr[temp++]=0;
    return 0;
  }
}