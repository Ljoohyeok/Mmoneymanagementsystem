package buttons;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import gui.MenuSelection;
import gui.WindowFrame;

public class ButtonCancel extends MouseAdapter{
	WindowFrame frame;
	public ButtonCancel(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		frame.setSize(500,300);
		frame.setupPanel(frame.getMenuselection());
	}
}
