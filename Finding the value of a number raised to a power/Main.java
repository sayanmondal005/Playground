import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();
        double result = Math.pow(b,e);
        System.out.println(result);
    }
}