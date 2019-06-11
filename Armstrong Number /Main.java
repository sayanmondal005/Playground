import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0,a=n,rem=0,b=n;
      double rev=0.0;
       while(n>0)
       {
         n=n/10;
         count+=1;
       }
       while(a>0)
       {
         rem=a%10;
         rev=rev+(Math.pow(rem,count));
         a=a/10;
       }
      if(rev==b)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}