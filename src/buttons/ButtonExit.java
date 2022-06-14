package buttons;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Mmoneymanagementsystem.AccountManager;
import Mmoneymanagementsystem.MenuManager;
import gui.WindowFrame;

public class ButtonExit extends MouseAdapter{
	private WindowFrame frame;
	private AccountManager am;
	public ButtonExit(WindowFrame frame, AccountManager am){
		this.frame = frame;
		this.am = am;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		MenuManager.putObject(am, "moneyMng.ser");
		frame.setVisible(false);
		System.exit(0);
	}
}
