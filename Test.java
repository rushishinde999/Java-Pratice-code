class Test extends Thread {

  public void run() {
    System.out.println("hello");
  }

  public static void main(String args[]) {
    Test t = new Test();

    t.start();
  }

}