import java.util.*;//import required packages

class Faculty
{
  public void salary(int n)
  {
    System.out.println("Base Salary: "+n);//write your Faculty class statements
  }
}
class CSE extends Faculty
{
  public void salary(int n)
  {
    System.out.println("CSE Faculty: "+(n+3000));//write your CSE class statements
  }
}
class IT extends Faculty
{
  public void salary(int n)
  {
    System.out.println("IT Faculty: "+(n+5000));//write your IT class statements
  }
}
class ECE extends Faculty
{
  public void salary(int n)
  {
    System.out.println("ECE Faculty: "+(n+4500));//write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Faculty obj1 = new Faculty();
    obj1.salary(n);
    CSE obj2 = new CSE();
    obj2.salary(n);
    IT obj3 = new IT();
    obj3.salary(n);
    ECE obj4 = new ECE();
    obj4.salary(n);
    //implement your required concept here
  }
}