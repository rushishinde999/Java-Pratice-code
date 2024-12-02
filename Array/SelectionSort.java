public class SelectionSort {

  private static int j;

  public static void main(String[] args) {
    int temp = 0;
    int min;
    int[] arr = { 7, 5, 3, 78, 23, 12 };

    for (int i = 0; i < arr.length; i++) {
      min = i;
      for (int j = i + 1; j < arr.length; j++) {

        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
    for (int a : arr) {
      System.out.print(a + " ");
    }
  }
}
