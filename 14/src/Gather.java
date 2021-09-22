/**
 * @Description: List集合
 * @Date: 2021-09-22 14:58:09
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-22 15:26:13
 * @FilePath: /14/src/Gather.java
 */
import java.util.*;
public class Gather {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    int i = (int)(Math.random()*list.size());
    System.out.println("随机获取数组中的元素：" + list.get(i));
    list.remove(2);
    System.out.println("将索引是2的元素从数组移除后，数组中的元素是：");
    for(int j = 0; j < list.size(); j++) {
      System.out.println(list.get(j));
    }
  }
}
