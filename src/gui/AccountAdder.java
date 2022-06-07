package gui; 

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountAdder extends JPanel {
	
	WindowFrame frame;
   
    public AccountAdder(WindowFrame frame) {
    	this.frame = frame;
    	
        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());
      
        JLabel labelNUM = new JLabel("NUM: ", JLabel.TRAILING);
        JTextField fieldNUM = new JTextField(10);
        labelNUM.setLabelFor(fieldNUM);
        panel.add(labelNUM);
        panel.add(fieldNUM);
      
        JLabel labelINCOME = new JLabel("INCOME: ", JLabel.TRAILING);
        JTextField fieldINCOME = new JTextField(10);
        labelINCOME.setLabelFor(fieldINCOME);
        panel.add(labelINCOME);
        panel.add(fieldINCOME);
      
        JLabel labelSPEND = new JLabel("SPEND: ", JLabel.TRAILING);
        JTextField fieldSPEND = new JTextField(10);
        labelSPEND.setLabelFor(fieldSPEND);
        panel.add(labelSPEND);
        panel.add(fieldSPEND);
      
        JLabel labelSAVING = new JLabel("SAVING: ", JLabel.TRAILING);
        JTextField fieldSAVING = new JTextField(10);
        labelSAVING.setLabelFor(fieldSAVING);
        panel.add(labelSAVING);
        panel.add(fieldSAVING);
      
        panel.add(new JButton("save"));
        panel.add(new JButton("cancel"));
      
        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
      
        this.add(panel);
        this.frame.setVisible(true);
    }
}
