package ReverseNO;

import java.util.Scanner;

public class Method3 {
  // using String StringBuilder
  public static void main(String[] args) {
    System.out.println("Enter the  Number is :");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    StringBuilder s = new StringBuilder();
    s.append(num);

    StringBuilder rev = s.reverse();
    System.out.println("reverse no is" + rev);
  }
}
