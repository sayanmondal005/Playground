import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    int end = str_len - 1;
    int front = 0;
    while(front < end)
    {
      char tmp_ch = sb.charAt(front);
      sb.setCharAt(front, sb.charAt(end));
      sb.setCharAt(end, tmp_ch);
      front++;
      end--;
    }
    String str1 = new String(sb);
    if(str.equals(str1))
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}