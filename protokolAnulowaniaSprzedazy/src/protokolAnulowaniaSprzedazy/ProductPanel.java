package protokolAnulowaniaSprzedazy;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

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
		super();
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		textField_00 = new JTextField();
		textField_00.setBounds(10, 0, 25, 20);
		textField_00.setColumns(10);

		textField_01 = new JTextField();
		textField_01.setBounds(35, 0, 180, 20);
		textField_01.setColumns(10);

		textField_02 = new JTextField();
		textField_02.setBounds(215, 0, 25, 20);
		textField_02.setColumns(10);

		textField_03 = new JTextField();

		textField_03.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent arg0) {

				if (hasDouble(textField_04) && hasDouble(textField_03)) {
					double d = multiplication(textField_03, textField_04);
					textField_05.setText(String.valueOf(d));
					textField_06.setText("23");
					textField_08.setText(BigDecimal.valueOf(d / 1.23).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
					textField_07
							.setText(BigDecimal.valueOf(d - d / 1.23).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
				} else {
					textField_05.setText("");
					textField_07.setText("");
					textField_08.setText("");

				}
			}
		});

		textField_03.setBounds(240, 0, 25, 20);
		textField_03.setColumns(10);

		textField_04 = new JTextField();

		textField_04.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent arg0) {

				if (hasDouble(textField_04) && hasDouble(textField_03)) {
					double d = multiplication(textField_03, textField_04);
					textField_05.setText(String.valueOf(d));
					textField_06.setText("23");
					textField_08.setText(BigDecimal.valueOf(d / 1.23).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
					textField_07
							.setText(BigDecimal.valueOf(d - d / 1.23).setScale(2, BigDecimal.ROUND_HALF_UP).toString());
				} else {
					textField_05.setText("");
					textField_07.setText("");
					textField_08.setText("");
				}
			}
		});

		textField_04.setBounds(265, 0, 60, 20);
		textField_04.setColumns(10);

		textField_05 = new JTextField();
		textField_05.setBounds(325, 0, 60, 20);
		textField_05.setColumns(10);

		textField_06 = new JTextField();
		textField_06.setBounds(385, 0, 25, 20);
		textField_06.setColumns(10);

		textField_07 = new JTextField();
		textField_07.setBounds(410, 0, 60, 20);
		textField_07.setColumns(10);

		textField_08 = new JTextField();
		textField_08.setBounds(470, 0, 60, 20);
		textField_08.setColumns(10);
		add(textField_00);
		add(textField_01);
		add(textField_02);
		add(textField_03);
		add(textField_04);
		add(textField_05);
		add(textField_06);
		add(textField_07);
		add(textField_08);

	}

	public boolean hasDouble(JTextField jT) {
		try {
			double d = Double.parseDouble(jT.getText());
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public double multiplication(JTextField jTF1, JTextField jTF2) {
		double d1, d2;
		d1 = Double.parseDouble(jTF1.getText());
		d2 = Double.parseDouble(jTF2.getText());
		return d1 * d2;
	}
	
	public JTextField getTextField_05() {
		return textField_05;
	}

	public JTextField getTextField_06() {
		return textField_06;
	}

	public JTextField getTextField_07() {
		return textField_07;
	}

	public JTextField getTextField_08() {
		return textField_08;
	}

}
