package ReverseNO;

import java.util.Scanner;

public class Method3 {
  // using String StringBuilder
  // NUmber as well as String Reverse::
  public static void main(String[] args) {
    System.out.println("Enter the  String is :");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    System.out.println("Enter the number: ");

    Scanner no = new Scanner(System.in);
    int n = no.nextInt();

    StringBuilder s = new StringBuilder();
    StringBuilder s1 = new StringBuilder();

    s.append(str);
    s1.append(n);

    StringBuilder re = s1.reverse();
    System.out.println("reverse no is : " + re);
    StringBuilder rev = s.reverse();
    System.out.println("reverse string is :" + rev);
  }
}
