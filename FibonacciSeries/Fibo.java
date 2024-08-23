package FibonacciSeries;

import java.util.Scanner;

public class Fibo {
  public static void main(String[] args) {
    System.out.println("Enter the no of terms in the series:");
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();

    int a = 0, b = 1;

    for (int i = 1; i <= no; i++) {
      int c = a + b;
      System.out.println("next term is " + c);
      a = b;
      b = c;

    }
    sc.close();

  }
}
