import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    int[][] intArray = new int[3][3];
    String[][] strArray = { { "Hello ", "wujie" }, { "Hello ", "yumw" } };
    for (int i = 0; i < intArray.length; i++) {
      for (int j = 0; j < intArray[i].length; j++) {
        System.out.println("(" + i + "," + j + ")" + ":" + intArray[i][j]);
      }
    }
    for (int i = 0; i < strArray.length; i++) {
      System.out.println(strArray[i][0] + strArray[i][1]);
    }
  }
}