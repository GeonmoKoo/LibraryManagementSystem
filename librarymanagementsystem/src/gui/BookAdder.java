package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JFrame {

    public BookAdder() {
        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        JLabel labelID = new JLabel("User ID:", JLabel.TRAILING);
        JTextField fieldID = new JTextField(10);
        labelID.setLabelFor(fieldID);
        panel.add(labelID);
        panel.add(fieldID);

        JLabel labelTitle = new JLabel("Title:", JLabel.TRAILING);
        JTextField fieldTitle = new JTextField(10);
        labelTitle.setLabelFor(fieldTitle);
        panel.add(labelTitle);
        panel.add(fieldTitle);

        JLabel labelBookId = new JLabel("Book Id:", JLabel.TRAILING);
        JTextField fieldBookId = new JTextField(10);
        labelBookId.setLabelFor(fieldBookId);
        panel.add(labelBookId);
        panel.add(fieldBookId);

        JLabel labelDate = new JLabel("Lending Date:", JLabel.TRAILING);
        JTextField fieldDate = new JTextField(10);
        labelDate.setLabelFor(fieldDate);
        panel.add(labelDate);
        panel.add(fieldDate);

        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        panel.add(saveButton);
        panel.add(cancelButton);

        // 그리드 레이아웃 적용
        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(panel);
        this.setVisible(true);
    }

}
