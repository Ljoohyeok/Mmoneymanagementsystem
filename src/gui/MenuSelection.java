package gui;

import java.awt.BorderLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Mmoneymanagementsystem.AccountManager;
import buttons.ButtonExit;
import buttons.ButtonGoAdd;
import buttons.ButtonGoDelete;
import buttons.ButtonGoViewer;
import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	AccountManager am;
    public MenuSelection(WindowFrame frame, AccountManager am) {
    	this.frame = frame;
    	
	    this.setLayout(new BorderLayout());
      
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Menu Selection");
        JButton button1 = new JButton("Add Account");
        JButton button2 = new JButton("Delete Account");
        JButton button3 = new JButton("View Account");
        JButton button4 = new JButton("Exit");
        
        button1.addMouseListener(new ButtonGoAdd(frame));
        button2.addMouseListener(new ButtonGoDelete(frame));
        button3.addMouseListener(new ButtonGoViewer(frame));
        button4.addMouseListener(new ButtonExit(frame, am));
        panel1.add(label);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
      
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
    }
}
