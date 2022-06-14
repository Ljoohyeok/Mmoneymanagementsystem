package gui;

import javax.swing.JFrame; 
import javax.swing.JPanel;

import Mmoneymanagementsystem.AccountManager;

public class WindowFrame extends JFrame {

	MenuSelection menuselection;
    AccountAdder accountadder;
    AccountViewer accountviewer;
    AccountDeleter accountdeleter;
    AccountManager moneyMng;
	
	public WindowFrame(AccountManager moneyMng) {
		this.menuselection = new MenuSelection(this, moneyMng);
	    this.accountadder = new AccountAdder(this, moneyMng);
	    this.accountdeleter = new AccountDeleter(this, moneyMng);
	    this.accountviewer = new AccountViewer(this, moneyMng);
		this.moneyMng = moneyMng;
	    
	    this.setSize(500, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setupPanel(menuselection);
	    
	    this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AccountAdder getAccountadder() {
		return accountadder;
	}

	public void setAccountadder(AccountAdder accountadder) {
		this.accountadder = accountadder;
	}

	public AccountViewer getAccountviewer() {
		this.setSize(500,550);
		return new AccountViewer(this, moneyMng);
	}

	public void setAccountviewer(AccountViewer accountviewer) {
		this.accountviewer = accountviewer;
	}
	
	public AccountDeleter getAccountdeleter() {
		return accountdeleter;
	}
	
	public void setAccountdeleter(AccountDeleter accountdeleter) {
		this.accountdeleter = accountdeleter;
	}
}
