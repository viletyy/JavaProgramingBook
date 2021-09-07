
/**
 * @Description: 文本域
 * @Date: 2021-09-07 10:42:11
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-07 10:44:35
 * @FilePath: /13/src/JTextAreaTest.java
 */
import java.awt.*;
import javax.swing.*;

public class JTextAreaTest extends JFrame {
  public JTextAreaTest() {
    setSize(200, 100);
    setTitle("定义自动换行的文本域");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    Container cp = getContentPane();
    JTextArea jt = new JTextArea("文本域", 6, 6);
    jt.setLineWrap(true);
    cp.add(jt);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JTextAreaTest();
  }
}