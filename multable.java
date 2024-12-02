import java.util.Scanner;

class multable {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the no");

    int a = s.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(a + "X" + i + "=" + a);
    }
  }

}