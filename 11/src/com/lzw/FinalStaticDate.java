/**
 * @Description: Do not edit
 * @Date: 2021-09-01 17:25:14
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-01 17:30:44
 * @FilePath: /11/src/com/lzw/FinalStaticDate.java
 */
package com.lzw;
import java.util.Random;
import static java.lang.System.out;

public class FinalStaticDate {
  private static Random rand = new Random();
  private final int a1 = rand.nextInt(10);
  private static final int A2 = rand.nextInt(10);
  public static void main(String[] args) {
    FinalStaticDate fdata = new FinalStaticDate();
    out.println("重新实例化对象调用a1的值：" + fdata.a1);
    out.println("重新实例好对象调用a2的值：" + fdata.A2);
    FinalStaticDate fdata2 = new FinalStaticDate();
    out.println("重新实例化对象调用a1的值：" + fdata2.a1);
    out.println("重新实例好对象调用a2的值：" + fdata2.A2);
  }
}
