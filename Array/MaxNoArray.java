package Array;

public class MaxNoArray {
  public static void main(String[] args) {

    int b[] = { 1, 4, 6, 3, 73, 78, 87, 3, 89, 32, 4 };

    int max = b[0];
    for (int i = 1; i < b.length; i++) {
      if (b[i] > max) {
        max = b[i];
      }
    }
    System.out.println("max no is : " + max);

  }
}
