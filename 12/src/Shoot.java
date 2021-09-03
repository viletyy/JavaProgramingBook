/**
 * @Description: Do not edit
 * @Date: 2021-09-03 11:32:17
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 11:33:25
 * @FilePath: /12/src/Shoot.java
 */
public class Shoot {
  static void pop() throws NegativeArraySizeException {
    int[] arr = new int[-3];
  }

  public static void main(String[] args) {
    try {
      pop();
    } catch (NegativeArraySizeException e) {
      System.out.println("pop()方法抛出异常");
    }
  }
}