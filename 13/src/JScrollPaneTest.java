
/**
 * @Description: 带滚动条的文字编译器
 * @Date: 2021-09-06 16:07:56
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 18:29:33
 * @FilePath: /13/src/JScrollPaneTest.java
 */
import java.awt.*;
import javax.swing.*;

public class JScrollPaneTest extends JFrame {
  public JScrollPaneTest() {
    Container c = getContentPane();
    JTextArea ta = new JTextArea(20, 50);
    JScrollPane sp = new JScrollPane(ta);
    c.add(sp);
    setTitle("带滚动条的文字编译器");
    setSize(200, 200);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  public static void main(String[] args) {
    new JScrollPaneTest();
  }
}