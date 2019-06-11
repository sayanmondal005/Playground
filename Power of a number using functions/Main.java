import java.util.Scanner;
class Main{
    public static double power(double a,double b)
    {
      double c=(Math.pow(a,b));
      return c;
    }
    public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exponent=sc.nextInt();
      double pow=power(base,exponent);
      System.out.println(pow);
	}
}