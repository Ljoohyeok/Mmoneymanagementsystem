package gui; 

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AccountViewer extends JFrame {

   public AccountViewer() {
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("NUM");
      model.addColumn("INCOME");
      model.addColumn("SPEND");
      model.addColumn("SAVING");
      
      JTable table = new JTable();
      JScrollPane sp = new JScrollPane(table);
      
      this.add(sp);
      this.setSize(300, 300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
   }
}
