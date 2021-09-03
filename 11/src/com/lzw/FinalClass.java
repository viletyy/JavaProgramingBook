/**
 * @Description: 定义final类
 * @Date: 2021-09-01 17:50:01
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 15:43:36
 * @FilePath: /11/src/com/lzw/FinalClass.java
 */
package com.lzw;

final class FinalClass {
  int a =3;
  void doit() {

  }
  public static void main(String[] args) {
    FinalClass f = new FinalClass();
    f.a++;
    System.out.println(f.a);
  }
}
