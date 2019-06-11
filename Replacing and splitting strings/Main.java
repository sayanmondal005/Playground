import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str_1 = sc.nextLine();
      String str_2 = sc.nextLine();
      int n = sc.nextInt();
      String str_3 = str_1.replace(str_1,str_2);
      String arr[] = str_3.split(" ",n);
      for (String temp: arr)
      {
	      System.out.println(temp);
	  } 
    }
}