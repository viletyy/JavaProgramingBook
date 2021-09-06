
/**
 * @Description: 面板
 * @Date: 2021-09-06 15:32:43
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 18:29:13
 * @FilePath: /13/src/JPanelTest.java
 */
import java.awt.*;
import javax.swing.*;

public class JpanelTest extends JFrame {
  public JpanelTest() {
    Container c = getContentPane();
    c.setLayout(new GridLayout(2, 1, 10, 10));
    JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
    JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
    JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
    JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
    p1.add(new JButton("1"));
    p1.add(new JButton("2"));
    p1.add(new JButton("3"));
    p2.add(new JButton("4"));
    p2.add(new JButton("5"));
    p3.add(new JButton("6"));
    p3.add(new JButton("7"));
    p4.add(new JButton("8"));
    p4.add(new JButton("9"));
    c.add(p1);
    c.add(p2);
    c.add(p3);
    c.add(p4);
    setTitle("在这个窗体中使用了面板");
    setSize(420, 200);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  public static void main(String[] args) {
    new JpanelTest();
  }
}