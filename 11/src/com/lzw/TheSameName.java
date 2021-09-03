/**
 * @Description: 内部类和外部类的引用
 * @Date: 2021-09-01 18:53:35
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 15:46:19
 * @FilePath: /11/src/com/lzw/TheSameName.java
 */
package com.lzw;

public class TheSameName {
  private int x;
  private class Inner {
    private int x = 9;
    public void doit(int x) {
      x++;
      this.x++;
      TheSameName.this.x++;
    }
  }
}
