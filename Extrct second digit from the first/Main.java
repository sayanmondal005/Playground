import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num=100;
       while(num<n)
       {
         n=n/10;
       }
       int a=n;
       int b=a%10;
       System.out.println(b);
	}
}