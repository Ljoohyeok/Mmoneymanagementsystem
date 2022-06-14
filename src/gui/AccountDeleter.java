package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Mmoneymanagementsystem.AccountManager;
import buttons.ButtonCancel;
import buttons.ButtonDelete;
import buttons.ButtonGoDelete;

public class AccountDeleter extends JPanel {
	private static final long serialVersionUID = -4287724266082210615L;
	WindowFrame frame;
	AccountManager am;
	JTextField fieldAccount = new JTextField("");
	
	AccountDeleter(WindowFrame frame, AccountManager am) {
		this.frame = frame;
		this.am = am;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		JLabel labelAccount = new JLabel("Account : ", JLabel.TRAILING);
        
        
		labelAccount.setLabelFor(fieldAccount);
        
        panel.add(labelAccount);
        panel.add(fieldAccount);
      
        
        JButton cancel = new JButton("cancel");
        cancel.addMouseListener(new ButtonCancel(frame));
        JButton delete = new JButton("delete");
     	delete.addMouseListener(new ButtonDelete(frame,am,this));
        panel.add(delete);
        panel.add(cancel);
        
        SpringUtilities.makeCompactGrid(panel, 2, 2, 6, 6, 6, 6);
        this.add(panel);
		this.frame.setVisible(true);
	}
	public String getNum() {
		return fieldAccount.getText();
	}
}
