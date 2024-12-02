public class revno

{

  public static void main(String[] args) {

    int no = 512, rev = 0, rem;
    int a = 50;
    System.out.println(a % 5);
    while (no != 0) {

      rem = no % 10;
      rev = rev * 10 + rem;
      no = no / 10;
    }

    System.out.println(rev);

  }

}
