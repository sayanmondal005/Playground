import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int p=n,strong=0,c=n;
       while(n>0)
       {
           int fact=1;
         int a=n%10;
           for(int i=1;i<=a;i++)
           {
            fact=fact*i;
           }
         strong=strong+fact;
         n=n/10;
       }
      if(c==strong)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}