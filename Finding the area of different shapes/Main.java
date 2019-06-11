import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int ch = sc.nextInt();
       switch(ch)
       {
           case 1:
               int n = sc.nextInt();
               int result_1 = n*n;
               System.out.println(result_1);
               break;
           case 2:
               int a = sc.nextInt();
               int b = sc.nextInt();
               int result_2 = a*b;
               System.out.println(result_2);
               break;
           case 3:
               int c = sc.nextInt();
               int d = sc.nextInt();
               double result_3 = ((0.5)*c*d);
               System.out.println(result_3);
               break;
           case 4:
               int r = sc.nextInt();
               double result_4 = (3.14)*r*r;
               System.out.println(result_4);
               break;
           default:
               System.out.println("Invalid");
               break;
       }
   }
}