package Assignment12;

import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class Moving extends JFrame{
	Moving(){
		JFrame frame = new JFrame("assignment");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.addMouseListener(new MyAdapter(frame));
	}
}

