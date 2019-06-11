import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int result=(maximum(a,b));
      System.out.println(maximum(result,c));  
	}
  public static int maximum(int n,int m)
  {
    int max;
    if(n>m)
    {
      max=n;
    }
    else
    {
      max=m;
    }
    return max;
  }
}