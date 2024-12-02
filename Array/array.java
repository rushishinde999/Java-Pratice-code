public class array {

  public static void main(String[] args) {

    int[] a = new int[] { 1, 2, 3, 4, 5 };
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

    // int[] b = { 7, 8, 9, 4 };

    // for (int i : b) {
    // System.out.println(i);

    // }

    // int[][] c;
    // c = new int[2][2];

    // int[][] f = new int[3][3];

    int[][] z = { { 10, 20, 30 }, { 40, 50, 60 } };
    System.out.println(z[0].length);

    for (int i = 0; i <= z.length; i++)

    {
      for (int j = 0; j < z[i].length; j++) {
        System.out.print(z[i][j] + " ");
      }
      System.out.println();
    }

  }
}
