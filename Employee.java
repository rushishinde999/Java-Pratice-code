class Employee {
  int no;
  String name;

  public int getno() {
    return no;
  }

  public String getname() {
    return name;
  }

  public void setno(int n) {
    no = n;
  }

  public void setname(String nm) {
    name = nm;
  }

  public static void main(String args[]) {
    Employee e = new Employee();
    e.setname("rushikesh");
    e.setno(999);

    System.out.println(e.getname());
    System.out.println(e.getno());

  }

}