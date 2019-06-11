import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
         int n= in.nextInt();
         int a1=n%10;
         n=n/10;
         int a2=n%10;
         int num=a2;
          System.out.println(num);
	}
}