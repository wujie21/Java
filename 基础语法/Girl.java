public class Girl {
  private String name;
  private int age;

  public Girl(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void marry(Boy boy) {
    System.out.println("我想嫁" + boy.getName());
    boy.marry(this);
  }
}
