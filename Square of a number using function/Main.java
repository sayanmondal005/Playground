import java.util.Scanner;
class Main
{
	 public static int sqr(int num)
     {
       int a=num*num;
       return a;
     }
      public static void main(String [] args)
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqrt=sqr(n);
        System.out.println(sqrt);
      }
	} 