package buttons;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Mmoneymanagementsystem.AccountManager;
import gui.AccountDeleter;
import gui.WindowFrame;

public class ButtonDelete extends MouseAdapter{
	WindowFrame frame;
	AccountManager am;
	AccountDeleter ad;
	public ButtonDelete(WindowFrame frame, AccountManager am, AccountDeleter ad) {
		this.frame=frame;
		this.am = am;
		this.ad = ad;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int num = Integer.parseInt(ad.getNum());
		for(int i=0; i<am.getList().size(); i++) {
			if(am.getList().get(i).getAccname() == num) {
				am.getList().remove(am.getList().get(i));
				frame.setupPanel(frame.getMenuselection());
				return;
			}
		}
	}
}
