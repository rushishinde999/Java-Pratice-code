import java.util.Scanner;

class Swapno {

  public static void main(String[] args)

  {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the no1");
    int a = s.nextInt();
    System.out.println("enter the no2");

    int b = s.nextInt();
    System.out.println("enter the name");
    String name = s.next();
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a" + a);
    System.out.println("b" + b);
  }
}