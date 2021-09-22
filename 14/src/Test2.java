/**
 * @Description: Do not edit
 * @Date: 2021-09-22 16:00:43
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-22 16:06:27
 * @FilePath: /14/src/Test2.java
 */
import java.util.*;
public class Test2 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("a");
    list.add("c");
    list.add("C");
    list.add("a");
    Iterator listIt = list.iterator();
    System.out.println("往list中添加重复元素：");
    while(listIt.hasNext()) {
      System.out.println(listIt.next());
    }
    Set<String> set  = new HashSet<>();
    set.add("A");
    set.add("a");
    set.add("C");
    set.add("c");
    set.add("a");
    Iterator setIt = set.iterator();
    System.out.println("往set中添加重复元素：");
    while(setIt.hasNext()) {
      System.out.println(setIt.next());
    }
  }
}
