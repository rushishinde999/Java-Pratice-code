import java.util.Scanner;

public class cal {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the no 1");
    int a = s.nextInt();
    System.out.println("Enter the no 2");

    int b = s.nextInt();
    int result;
    System.out.println("Enter the operation");
    String symbol = s.next();

    switch (symbol) {
      case "+":
        result = a + b;
        System.out.println(result);
        break;

      case "-":
        result = a - b;
        System.out.println(result);
      case "*":
        result = a + b;
        System.out.println(result);
        break;
      case "/":
        result = a + b;
        System.out.println(result);
        break;
    }
  }
}
