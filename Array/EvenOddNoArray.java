package Array;

import java.util.ArrayList;

public class EvenOddNoArray {
  public static void main(String[] args) {

    int[] a = { 1, 3, 5, 54, 2, 6, 23, 6, 2, 5, };

    ArrayList<Integer> al1 = new ArrayList<>();
    ArrayList<Integer> al2 = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      if ((a[i]) % 2 == 0) {
        al1.add(a[i]);
      } else {
        al2.add(a[i]);
      }
    }
    System.out.println("the even no are :");

    for (int no1 : al1) {
      System.out.println(no1);
    }
    System.out.println("odd no are :");
    for (int no2 : al2) {
      System.out.println(no2);
    }

  }
}
