import java.util.*;
class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int index = 0; index < n; index++)
       {
           arr[index] = sc.nextInt();
       }
       int Sum_1=arr[0];
       int Sum_2=arr[0];
       for(int i = 1; i < n; i++)
       {
         int a = 0;
         if(arr[i] == arr[i-1])
         {
            Sum_1=Sum_1+arr[i];
         }
         else
         {
            Sum_1=arr[i];
         }
         if(Sum_1 > Sum_2)
         {
             Sum_2=Sum_1;
         }
       }
       System.out.println(Sum_2);
   }
}