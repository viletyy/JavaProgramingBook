/**
 * @Description: Do not edit
 * @Date: 2021-09-02 10:17:13
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 15:29:50
 * @FilePath: /11/src/com/lzw/StaticInnerClass.java
 */
package com.lzw;

public class StaticInnerClass {
  static int x = 100;
  static class Inner {
    void doitInner() {
      System.out.println("外部类"+x);
    }

    public static void main(String[] args) {
      Inner i = new Inner();
      i.doitInner();
      System.out.println("a");
    }
  }
}