package gui; 

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Mmoneymanagementsystem.AccountManager;
import Mmoneymanagementsystem.MenuManager;
import buttons.ButtonAdd;
import buttons.ButtonCancel;

public class AccountAdder extends JPanel {
	
	WindowFrame frame;
    AccountManager am;
    JTextField fieldNUM = new JTextField("");
    JTextField fieldINCOME = new JTextField("");
    JTextField fieldSPEND = new JTextField("");
    JTextField fieldSAVING = new JTextField("");
    public AccountAdder(WindowFrame frame, AccountManager am) {
    	this.frame = frame;
    	this.am = am;
    	
        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());
      
        JLabel labelNUM = new JLabel("NUM: ", JLabel.TRAILING);
        labelNUM.setLabelFor(fieldNUM);
        panel.add(labelNUM);
        panel.add(fieldNUM);
      
        JLabel labelINCOME = new JLabel("INCOME: ", JLabel.TRAILING);
        labelINCOME.setLabelFor(fieldINCOME);
        panel.add(labelINCOME);
        panel.add(fieldINCOME);
      
        JLabel labelSPEND = new JLabel("SPEND: ", JLabel.TRAILING);
        labelSPEND.setLabelFor(fieldSPEND);
        panel.add(labelSPEND);
        panel.add(fieldSPEND);
      
        JLabel labelSAVING = new JLabel("SAVING: ", JLabel.TRAILING);
        labelSAVING.setLabelFor(fieldSAVING);
        panel.add(labelSAVING);
        panel.add(fieldSAVING);
      
        
        JButton cancel = new JButton("cancel");
        cancel.addMouseListener(new ButtonCancel(frame));
        JButton save = new JButton("save");
        save.addMouseListener(new ButtonAdd(frame,am,this));
        panel.add(save);
        panel.add(cancel);
      
        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
      
        this.add(panel);
        this.frame.setVisible(true);
    }
    public String getNum() {
    	return fieldNUM.getText();
    }
    public String getIncome() {
    	return fieldINCOME.getText();
    }
    public String getSpend() {
    	return fieldSPEND.getText();
    }
    public String getSaving() {
    	return fieldSAVING.getText();
    }
}
