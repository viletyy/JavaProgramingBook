/**
 * @Description: Do not edit
 * @Date: 2021-09-03 13:50:39
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 14:02:12
 * @FilePath: /12/src/Student.java
 */
public class Student {
  public void speak(int m) throws MyException {
    if (m > 1000) {
      throw new MyException("参数不能大于1000");
    }
  }

  public static void main(String[] args) {
    try {
      Student s = new Student();
      s.speak(10002);
    } catch (MyException e) {
      System.out.println(e.message);
    }
  }
}
