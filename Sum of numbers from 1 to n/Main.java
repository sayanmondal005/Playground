import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int count,sum=0;
         for(count=0;count<=n;count=count+1)
         {   
           sum=sum+count;
         }
      System.out.println(sum);
	}
}