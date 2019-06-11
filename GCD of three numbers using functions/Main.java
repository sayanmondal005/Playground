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
    int min=0,gcd=0;
    if(n<m)
    {
      min=n;
    }
    else
    {
      min=m;
    }
    while(min>=1)
    {
      if((n%min==0)&&(m%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
}