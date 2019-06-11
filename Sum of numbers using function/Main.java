import java.util.Scanner;
class Main
{
	 public static int sum(int num)
     { 
       int i;int sum=0;
       for(i=1;i<=num;i++){
       sum=sum+i;
       }
       return sum;
     }
      public static void main(String [] args)
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int add=sum(n);
        System.out.println(add);
      }
	} 