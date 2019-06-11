import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
         int n= in.nextInt();
         int a1=n/10;
         int a2=n%10;
         int add=a1+a2;
          System.out.println(add);
	}
}