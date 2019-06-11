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
        int rot=sc.nextInt();
        int odd[]=new int[n];
        int odd_pos=0;
        int even[]=new int[n];
        int even_pos=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
             odd[odd_pos]=arr[i];
             odd_pos++;
            }
            else
            {
             even[even_pos]=arr[i];
             even_pos++;
            }
        }
        for(int r=1;r<=rot;r++)
        {
        int temp_odd=odd[odd_pos-1];
        for(int i=(odd_pos-2);i>=0;i--)
        {
            odd[i+1]=odd[i];
        }
        odd[0]=temp_odd;
        }
        for(int r=1;r<=rot;r++)
        {
        int temp_even=even[0];
        for(int i=1;i<(even_pos);i++)
        {
            even[i-1]=even[i];
        }
        even[even_pos-1]=temp_even;
        }
        odd_pos=0;
        even_pos=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
             arr[i]=odd[odd_pos];
             odd_pos++;
            }
            else
            {
              arr[i]=even[even_pos];
              even_pos++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}