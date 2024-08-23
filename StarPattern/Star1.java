package StarPattern;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Star1 {

  // *
  // **
  // ***
  // ****
  // *****

  public static void main(String[] args) {
    System.out.println("ENter the no of rows");

    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();

    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("reverse no of star pattern ---------");
    System.out.println("Enter the no of rows");
    Scanner s = new Scanner(System.in);
    int row = s.nextInt();

    for (int i = 1; i <= row; i++) {
      for (int j = row; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }

}
