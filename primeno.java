import java.util.Scanner;

public class primeno

{

  public static void main(String args[]) {

    boolean isPrime = true;
    int no;
    System.out.println("Enter the Number");
    Scanner sc = new Scanner(System.in);
    no = sc.nextInt();

    for (int i = 2; i <= no / 2; i++)

    {
      if (no % i == 0) {
        isPrime = false;
        break;

      }
    }
    if (isPrime && no > 1)

    {
      System.out.println("prime number");

    } else {
      System.out.println("not a prime number");
    }

  }

}
