
/**
 * @Description: 网格组布局管理器
 * @Date: 2021-09-06 14:52:17
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 17:17:06
 * @FilePath: /13/src/ExampleFrame03.java
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExampleFrame03 extends JFrame {
  private static final long serialVersionUID = 1L;

  public ExampleFrame03() {
    super();
    setTitle("使用网格组布局管理器");
    getContentPane().setLayout(new GridBagLayout());
    setBounds(100, 100, 500, 170);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    final JButton button = new JButton("A");
    final GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.weightx = 10;
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    getContentPane().add(button, gridBagConstraints);

    final JButton button1 = new JButton("B");
    final GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
    gridBagConstraints1.gridy = 0;
    gridBagConstraints1.gridx = 1;
    gridBagConstraints1.insets = new Insets(0, 5, 0, 0);
    gridBagConstraints1.weightx = 20;
    gridBagConstraints1.fill = gridBagConstraints.HORIZONTAL;
    getContentPane().add(button1, gridBagConstraints1);

    final JButton button2 = new JButton("C");
    final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
    gridBagConstraints2.gridy = 0;
    gridBagConstraints2.gridx = 2;
    gridBagConstraints2.gridheight = 2;
    gridBagConstraints2.insets = new Insets(0, 5, 0, 0);
    gridBagConstraints2.weightx = 30;
    gridBagConstraints2.fill = GridBagConstraints.BOTH;
    getContentPane().add(button2, gridBagConstraints2);

    final JButton button3 = new JButton("D");
    final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
    gridBagConstraints3.gridy = 0;
    gridBagConstraints3.gridx = 3;
    gridBagConstraints3.gridheight = 4;
    gridBagConstraints3.insets = new Insets(0, 5, 0, 5);
    gridBagConstraints3.weightx = 40;
    gridBagConstraints3.fill = GridBagConstraints.BOTH;
    getContentPane().add(button3, gridBagConstraints3);

    final JButton button4 = new JButton("E");
    final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
    gridBagConstraints4.gridy = 1;
    gridBagConstraints4.gridx = 0;
    gridBagConstraints4.gridwidth = 2;
    gridBagConstraints4.insets = new Insets(5, 0, 0, 0);
    gridBagConstraints4.fill = GridBagConstraints.HORIZONTAL;
    getContentPane().add(button4, gridBagConstraints4);

    final JButton button5 = new JButton("F");
    final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
    gridBagConstraints5.gridy = 2;
    gridBagConstraints5.gridx = 0;
    gridBagConstraints5.insets = new Insets(5, 0, 0, 0);
    gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
    getContentPane().add(button5, gridBagConstraints5);

    // final JButton button6 = new JButton("G");
    // final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
    // gridBagConstraints6.gridy = 2;
    // gridBagConstraints6.gridx = 1;
    // gridBagConstraints6.gridwidth = 2;
    // gridBagConstraints6.gridheight = 2;
    // gridBagConstraints6.insets = new Insets(5, 5, 0, 0);
    // gridBagConstraints6.fill = GridBagConstraints.BOTH;
    // getContentPane().add(button6, gridBagConstraints6);

    final JButton button6 = new JButton("G");
    final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
    gridBagConstraints6.gridy = 2;
    gridBagConstraints6.gridx = 1;
    gridBagConstraints6.gridwidth = 2;
    gridBagConstraints6.gridheight = 2;
    gridBagConstraints6.insets = new Insets(5, 5, 0, 0);
    gridBagConstraints6.fill = GridBagConstraints.VERTICAL;
    gridBagConstraints6.ipadx = 30;
    gridBagConstraints6.anchor = GridBagConstraints.EAST;
    getContentPane().add(button6, gridBagConstraints6);

    final JButton button7 = new JButton("H");
    final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
    gridBagConstraints7.gridy = 3;
    gridBagConstraints7.gridx = 0;
    gridBagConstraints7.insets = new Insets(5, 0, 0, 0);
    gridBagConstraints7.fill = GridBagConstraints.HORIZONTAL;
    getContentPane().add(button7, gridBagConstraints7);
  }

  public static void main(String[] args) {
    ExampleFrame03 frame = new ExampleFrame03();
    frame.setVisible(true);
  }
}