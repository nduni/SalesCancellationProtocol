package protokolAnulowaniaSprzedazy;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductPanel extends JPanel {
	private JTextField textField_00;
	private JTextField textField_01;
	private JTextField textField_02;
	private JTextField textField_03;
	private JTextField textField_04;
	private JTextField textField_05;
	private JTextField textField_06;
	private JTextField textField_07;
	private JTextField textField_08;
	private ArrayList<JTextField> panelList;
	
	public ProductPanel() {
		textField_00 = new JTextField();
		textField_00.setText("1");
		textField_00.setBounds(10, 72, 25, 20);
		//frame.getContentPane().add(textField_00);
		textField_00.setColumns(10);

		textField_01 = new JTextField();
		textField_01.setBounds(37, 72, 181, 20);
	//	frame.getContentPane().add(textField_01);
		textField_01.setColumns(10);

		textField_02 = new JTextField();
		textField_02.setBounds(217, 72, 25, 20);
		//frame.getContentPane().add(textField_02);
		textField_02.setColumns(10);

		textField_03 = new JTextField();
	}

}
