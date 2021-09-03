/**
 * @Description: try catch 异常处理
 * @Date: 2021-09-03 10:43:08
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 10:44:09
 * @FilePath: /12/src/Take.java
 */
public class Take {
  public static void main(String[] args) {
    try {
      String str = "lili";
      System.out.println(str + "年龄是：");
      int age = Integer.parseInt("20L");
      System.out.println(age);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("program over");
  }
}
