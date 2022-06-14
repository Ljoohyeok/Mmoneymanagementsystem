package buttons;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import Mmoneymanagementsystem.AccountKinds;
import Mmoneymanagementsystem.AccountManager;
import Mmoneymanagementsystem.Accounts;
import Mmoneymanagementsystem.MenuManager;
import Mmoneymanagementsystem.SSAaccountPerson;
import gui.AccountAdder;
import gui.WindowFrame;

public class ButtonAdd extends MouseAdapter{
	public WindowFrame frame;
	public AccountManager am;
	public MenuManager mm;
	public int num;
	public int income;
	public int spend;
	public int saving;
	public AccountAdder panel;
	public ButtonAdd(WindowFrame frame, AccountManager am, AccountAdder panel) {
		this.frame = frame;
		this.am = am;
		this.panel = panel;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		this.num = Integer.parseInt(panel.getNum());
		for(int i=0; i<am.getList().size(); i++) {
			if(this.num == am.getList().get(i).getAccname()) {
				return;
			}
		}
		this.income = Integer.parseInt(panel.getIncome());
		this.spend = Integer.parseInt(panel.getSpend());
		this.saving = Integer.parseInt(panel.getSaving());
		SSAaccountPerson accounting = new SSAaccountPerson(AccountKinds.SSAaccount);
		accounting.setAccname(this.num);
		accounting.setIncome(this.income);
		accounting.setSpend(this.spend);
		accounting.setSaving(this.saving);
		am.addAccount(accounting);
		MenuManager.putObject(am, "moneyMng.ser");
		frame.setupPanel(frame.getMenuselection());
	}
}
