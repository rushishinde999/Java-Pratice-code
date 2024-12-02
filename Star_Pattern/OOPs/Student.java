package Star_Pattern.OOPs;

public interface Student {

  public void eat();

  public void sleep();
}

class Rushi implements Student {

  public void eat() {
    System.out.println("Eating..");
  }

  public void sleep() {
    System.out.println("sleping");
  }

  public static void main(String[] args) {
    Rushi r = new Rushi();
    r.eat();
    r.sleep();
  }

}
