/**
 * @Description: 成员内部类
 * @Date: 2021-09-01 18:08:13
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 15:44:04
 * @FilePath: /11/src/com/lzw/OuterClass.java
 */
package com.lzw;

public class OuterClass {
  innerClass in = new innerClass();
  public void ouf() {
    in.inf();
  }

  class innerClass {
    innerClass() {

    }
    public void inf() {

    }
    int y =0;
  }

  public innerClass doit() {
    // y = 4;
    in.y = 4;
    return new innerClass();
  }

  public static void main(String[] args) {
    OuterClass out = new OuterClass();
    OuterClass.innerClass in = out.doit();
    System.out.println(in.y);
    OuterClass.innerClass in2 = out.new innerClass();
    System.out.println(in2.y);
    System.out.println(out.in.y);
  }
}
