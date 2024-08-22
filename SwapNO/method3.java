package SwapNO;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class method3 {

  // use multi and divi operator * /
  public static void main(String[] args) {
    System.out.println("Enter the two no:");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    a = a * b;
    b = a / b;
    a = a / b;

    System.out.println("after the swapping a is " + a + " and b is " + b);

  }

}
