/**
 * @Description: 抛出异常
 * @Date: 2021-09-03 11:20:24
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 11:23:30
 * @FilePath: /12/src/Tran.java
 */
public class Tran {
  static int avg(int number1, int number2) throws MyException {
    if (number1 < 0 || number2 < 0) {
      throw new MyException("不可以使用负数");
    }
    if (number1 > 100 || number2 > 100) {
      throw new MyException("数值太大了");
    }

    return (number1 + number2) / 2;
  }

  public static void main(String[] args) {
    try {
      int result = avg(102, 105);
      System.out.println(result);
    } catch (MyException e) {
      e.printStackTrace();
      System.out.println(e);
    }
  }
}
