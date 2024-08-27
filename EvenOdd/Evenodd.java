import java.util.Scanner;

public class Evenodd {

  public static void main(String[] args) {

    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();

    if (b % 2 == 0) {
      System.err.println("Even no");
    } else {
      System.out.println("Odd no");
    }
    ;

  }
}
