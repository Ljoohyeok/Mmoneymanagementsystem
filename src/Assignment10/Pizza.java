package Assignment10;  

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Pizza {
   
   public static void main(String[] args) {
      JFrame frame = new JFrame("MyFrame");
      JPanel panel = new JPanel();
      JLabel label1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
      JLabel label2 = new JLabel("count");
      JButton button1 = new JButton("Combination Pizza");
      JButton button2 = new JButton("Potato pizza");
      JButton button3 = new JButton("Roasted meat pizza");
      JTextArea text = new JTextArea("          ");
         
      button1.setBounds(40, 60, 180, 25);
      button2.setBounds(260, 60, 150, 25);
      button3.setBounds(460, 60, 180, 25);
      label1.setBounds(310, 10, 300, 25);
      label2.setBounds(655, 60, 50, 25);
      text.setBounds(700, 60, 160, 25);
      panel.setLayout(null);
      panel.add(label1);
      panel.add(label2);
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(text);
      frame.add(label1, BorderLayout.NORTH);
      frame.add(label1, BorderLayout.CENTER);
      frame.add(text, BorderLayout.CENTER);
      frame.add(panel, BorderLayout.CENTER);
      frame.setSize(920, 200);
      frame.setVisible(true);
   }
}