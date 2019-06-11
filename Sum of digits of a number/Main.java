import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a,sum=0,num=1;
       while(num<n)
       {
         a=n%10;
         n=n/10;
         sum=sum+a;
       }
         System.out.println(sum);
	}
}