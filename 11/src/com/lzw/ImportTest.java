/**
 * @Description: 使用import导入静态成员
 * @Date: 2021-09-01 16:59:15
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 15:41:19
 * @FilePath: /11/src/com/lzw/ImportTest.java
 */
package com.lzw;

import static java.lang.Math.max;
import static java.lang.System.out;

public class ImportTest {
  public static void main(String[] args) {
    out.println("1和4的较大值为：" + max(1,4));
  } 
}