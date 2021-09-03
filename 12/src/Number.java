/**
 * @Description: Do not edit
 * @Date: 2021-09-03 14:04:17
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 14:11:45
 * @FilePath: /12/src/Number.java
 */
public class Number {
  public int count(int x, int y) throws Exception {
    return x * y;
  }

  public static void main(String[] args) {
    try {
      Number n = new Number();
      int result = n.count(12315, 57876876);
      System.out.println(result);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}