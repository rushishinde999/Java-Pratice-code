package SwapNO;

import java.util.Scanner;

public class Method2 {

  public static void main(String[] main) {
    System.out.println("Enter the two no");

    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    a = a + b; // 10+20=30
    b = a - b; // 30-20=10
    a = a - b; // 30-20=10

    System.out.println("after the sorting a is " + a + " b is " + b);
  }
}
