import java.util.Scanner;

public class Utility {
  private static Scanner scanner = new Scanner(System.in);

  /* 读取长度不超过limit的字符串 */
  private static String readKeyBoard(int limit) {
    String line = "";
    /* 判断是否有输入 */
    while (scanner.hasNext()) {
      /* 接收一行输入，可包括空格 */
      line = scanner.nextLine();
      if (line.length() < 1 || line.length() > limit) {
        System.out.print("输入长度(不大于" + limit + ")");
        continue;
      } else
        break;
    }
    return line;
  }

  public static char readMenuSelection() {
    char c;
    for (;;) {
      String str = readKeyBoard(1);
      /* 返回指定索引处的字符 */
      c = str.charAt(0);
      if (c != '1' && c != '2' && c != '3' && c != '4') {
        System.out.print("选择错误，请重新输入：");
      } else
        break;
    }
    return c;
  }

  public static int readNumber() {
    int n;
    for (;;) {
      String str = readKeyBoard(4);
      try {
        /* 将字符串参数 str 解析为有符号十进制整数 */
        n = Integer.parseInt(str);
        break;
      } catch (NumberFormatException e) { // 如果字符串str不包含可解析的整数
        System.out.print("数字输入错误，请重新输入：");
      }
    }
    return n;
  }

  public static String readString() {
    String str = readKeyBoard(8);
    return str;
  }

  public static char readConfirmSelection() {
    char c;
    for (;;) {
      String str = readKeyBoard(1).toUpperCase();
      c = str.charAt(0);
      if (c == 'Y' || c == 'N') {
        break;
      } else {
        System.out.print("选择错误，请重新输入：");
      }
    }
    return c;
  }
}