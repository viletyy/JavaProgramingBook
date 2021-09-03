/**
 * @Description: 自定义异常
 * @Date: 2021-09-03 11:15:18
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 11:35:29
 * @FilePath: /12/src/MyException.java
 */
public class MyException extends Exception {
  String message;

  public MyException(String errorMessage) {
    message = errorMessage;
  }

  public String getMessage() {
    return message;
  }
}
