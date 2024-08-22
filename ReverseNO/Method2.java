package ReverseNO;

import java.util.Scanner;

public class Method2 {
  public static void main(String[] args) {
    System.out.println("ENter the number");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    StringBuffer sb = new StringBuffer(String.valueOf(num));
    StringBuffer rev = sb.reverse();
    System.out.println("rev is " + rev);
  }
}
