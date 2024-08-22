package SwapNO;

import java.util.Scanner;

public class Method1 {
  // using third variable
  public static void main(String[] args) {
    System.out.println("Enter the two no");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    // int a = 10;
    int b = s.nextInt();

    System.out.println("before swapping " + a + " " + b);
    int temp;
    temp = a;
    a = b;
    b = temp;

    System.out.println("after swapping a is" + a + "and b is" + b);

  }
}