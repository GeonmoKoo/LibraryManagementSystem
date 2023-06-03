//package gui;
//
//import javax.swing.JFrame;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//
//public class BookViewer extends JFrame {
//	
//	public BookViewer() {
//		DefaultTableModel model = new DefaultTableModel();
//		model.addColumn("User Id");
//		model.addColumn("Book Title");
//		model.addColumn("Book Id");
//		model.addColumn("Contact Info.");
//
//	String column[] = {"USERID", "TITLE", "BOOKID", "DATE."};
//	
//	JTable table = new JTable(new DefaultTableModel());
//	JScrollPane sp = new JScrollPane(table);
//	
//	
//	this.setSize(300, 300);
//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	
//	this.setVisible(true);
//	}
//}

package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookViewer extends JFrame {
	
	public BookViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("User Id");
		model.addColumn("Book Title");
		model.addColumn("Book Id");
		model.addColumn("Contact Info.");

		JTable table = new JTable(model); // 수정: 올바른 DefaultTableModel을 사용
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp); // 수정: JScrollPane을 JFrame에 추가
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
}
