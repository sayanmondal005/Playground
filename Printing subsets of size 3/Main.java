import java.util.Scanner;
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
        for(int in=0;in<=n-2;in++)
        {
            for(int ind=in+1;ind<n;ind++)
            {
              for(int indi=ind+1;indi<n;indi++)
              {
                 System.out.print("("+arr[in]+","+" "+arr[ind]+","+" "+arr[indi]+")"+" ");
              }
            }
              System.out.print("\n");
        }
    }
}