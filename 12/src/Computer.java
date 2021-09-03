/**
 * @Description: Do not edit
 * @Date: 2021-09-03 14:12:06
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 14:30:51
 * @FilePath: /12/src/Computer.java
 */
public class Computer {
  public static int getMaxComm(int m, int n) throws MyException {
    if (m <= 0 || n <= 0) {
      throw new MyException("输入参数不能小于0");
    }

    if (m < n) {
      int temp = 0;
      temp = m;
      m = n;
      n = temp;
    }
    int r = m % n;
    while (r != 0) {
      m = n;
      n = r;
      r = m % n;
    }

    return n;
  }

  public static void main(String[] args) {
    try {
      int m = 122, n = 0;
      int result = getMaxComm(m, n);
      System.out.println(m + "和" + n + "最大公约数为" + result);
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}