import javax.swing.JFrame;

/**
 * @Description: 窗体
 * @Date: 2021-09-03 15:13:04
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 15:59:10
 * @FilePath: /13/src/Example1.java
 */
import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame {
  public void createJFrame(String title) {
    JFrame jf = new JFrame(title);
    Container container = jf.getContentPane();
    JLabel jl = new JLabel("这是一个JFrame窗体");
    jl.setHorizontalAlignment(SwingConstants.CENTER);

    container.add(jl);
    container.setBackground(Color.white);
    jf.setVisible(true);
    jf.setSize(200, 150);
    jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Example1().createJFrame("创建一个JFrame窗体");
  }
}
