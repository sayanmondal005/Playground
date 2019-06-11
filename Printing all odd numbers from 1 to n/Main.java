import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int count;
         for(count=0;count<=n;count=count+1)
         {
           if(count%2==1)
             System.out.println(count);
         }
             count=count+1;
    } 
}