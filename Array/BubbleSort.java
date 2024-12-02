public class BubbleSort {

  public static void main(String[] args) {

    start(6);
    int temp;

    int a[] = { 40, 2, 99, 12, 4 };

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;

        }

      }

    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }

  static void start(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }

  }
}