package gui; 

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Mmoneymanagementsystem.AccountManager;
import Mmoneymanagementsystem.Accounts;

public class AccountViewer extends JPanel {
	
	WindowFrame frame;
	
	AccountManager moneyMng;

    public AccountViewer(WindowFrame frame, AccountManager moneyMng) {
    	this.frame = frame;
    	this.moneyMng = moneyMng;
    	
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NUM");
        model.addColumn("INCOME");
        model.addColumn("SPEND");
        model.addColumn("SAVING");
        
        for (int i = 0; i < moneyMng.size(); i++) {
        	Vector<Integer> row = new Vector<Integer>();
        	Accounts a = moneyMng.get(i);
        	row.add(a.getAccname());
        	row.add(a.getIncome());
        	row.add(a.getSpend());
        	row.add(a.getSaving());
        	model.addRow(row);
        }
      
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
      
        this.add(sp);
        frame.setVisible(true);
    }
}
