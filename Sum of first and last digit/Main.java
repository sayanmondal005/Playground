import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num=10;
       int count=0;
       int b=n%10;
       while(num<n)
       {
         n=n/10;
         count=count+1;
       }
       int a=n;
       int sum=a+b;
       System.out.println(sum);
	}
}