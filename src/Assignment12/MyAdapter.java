package Assignment12;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyAdapter extends MouseAdapter{
	JFrame frame;
	Graphics g;
	MyAdapter(JFrame frame){
		this.frame = frame;
		this.g = frame.getGraphics();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		frame.paint(g);
		g.drawRect(e.getX(), e.getY(), 20, 20);
	}
}
