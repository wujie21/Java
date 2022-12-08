class FamilyAccount {
  public static void main(String[] args) {
    boolean isFlag = true;
    int balance = 10000;
    String details = "收支\t账户金额\t收支金额\t说  明\n";
    while (isFlag) {
      System.out.println("------------------家庭收支记账软件------------------\n");
      System.out.println("                    1 收支明细                       ");
      System.out.println("                    2 登记收入                       ");
      System.out.println("                    3 登记支出                       ");
      System.out.println("                    4 退   出                     \n");
      System.out.print("                    请输入1-4:");
      char selection = Utility.readMenuSelection();
      switch (selection) {
        case '1':
          // System.out.println("1 收支明细");
          System.out.println("---------------当前收支明细记录----------------");
          System.out.println(details);
          System.out.println("-----------------------------------------------");
          break;
        case '2':
          // System.out.println("2 登记收入");
          System.out.print("本次收入金额:");
          int money = Utility.readNumber();
          System.out.print("本次收入说明:");
          String info = Utility.readString();
          balance += money;
          details += ("收入\t" + balance + "\t\t" + "收支金额" + money + "\t" + info + "\n");
          break;
        case '3':
          // System.out.println("3 登记支出");
          System.out.print("本次支出金额:");
          int pay = Utility.readNumber();
          System.out.print("本次支出说明:");
          String payinfo = Utility.readString();
          if (balance >= pay) {
            balance -= pay;
            details += ("支出\t" + balance + "\t\t" + "支出金额" + pay + "\t" + payinfo + "\n");
          } else {
            System.out.print("支出超出额度!");
          }
          break;
        case '4':
          // System.out.println("4 退出");
          System.out.print("是否退出(Y/N):");
          char isExit = Utility.readConfirmSelection();
          if (isExit == 'Y') {
            isFlag = false;
          }
          break;
      }
    }
  }
}