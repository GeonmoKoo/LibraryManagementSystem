package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookViewer extends JFrame {
	
	public BookViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");

	String column[] = {"ID", "NAME", "E-MAIL", "CONTACT NO."};
	
	JTable table = new JTable(new DefaultTableModel());
	JScrollPane sp = new JScrollPane(table);
	
	
	this.setSize(300, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setVisible(true);
	}
}
