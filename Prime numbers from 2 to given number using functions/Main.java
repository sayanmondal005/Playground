import java.util.Scanner;
class Main{
    public static boolean is_prime(int m)
    {
      boolean is_prime=true;
      for(int i=2;i<=m/2;i++)
      {
        if(m %i ==0)
        {
          is_prime=false;
          break;
        }
      }
      return is_prime;
    }
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(is_prime(i))
      System.out.println(i);
      }
	}
}