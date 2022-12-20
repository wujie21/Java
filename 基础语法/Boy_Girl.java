public class Boy_Girl {
  public static void main(String[] args) {
    Boy boy = new Boy("wujie", 17);
    Girl girl = new Girl("wshaoyu", 17);
    boy.marry(girl);
    System.out.println("--------------------------");
    girl.marry(boy);
  }
}