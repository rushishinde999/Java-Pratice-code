package ReverseNO;

import java.util.Scanner;

public class Method1 {

  public static void main(String[] args) {
    System.out.println("Enter the Number");

    Scanner s = new Scanner(System.in);
    int num = s.nextInt(); // 1234

    int rev = 0;

    while (num != 0) {
      rev = rev * 10 + num % 10; // 0*10+1234= %10 =1234%10 =4

      num = num / 10; // 1234/10=123

    }
    System.out.println("rever no is" + rev);
  }
}
