
import java.awt.*;
import java.net.*;
import javax.swing.*;

/**
 * @Description: 图片图标
 * @Date: 2021-09-03 15:52:01
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 15:58:08
 * @FilePath: /13/src/MyImageIcon.java
 */
public class MyImageIcon extends JFrame {
  public MyImageIcon() {
    Container container = getContentPane();
    JLabel jl = new JLabel("这是一个JFrame窗体", JLabel.CENTER);
    URL url = MyImageIcon.class.getResource("imageButton.jpg");

    Icon icon = new ImageIcon(url);
    jl.setIcon(icon);

    jl.setHorizontalAlignment(SwingConstants.CENTER);
    jl.setOpaque(true);
    container.add(jl);
    setSize(250, 100);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MyImageIcon();
  }
}
