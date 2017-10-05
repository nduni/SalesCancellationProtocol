package protokolAnulowaniaSprzedazy;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.awt.Component;
import javax.swing.JLabel;

public class ProtokolAnulowaniaSprzedazy {

	private JFrame frame;
	private Map<String,JPanel> panelMap;
	private JTextField textField_000;
	private JTextField textField_001;
	private JTextField textField_002;
	private JTextField textField_003;
	private JTextField textField_010;
	private JTextField textField_011;
	private JTextField textField_012;
	private JTextField textField_013;
	private JTextField textField_020;
	private JTextField textField_021;
	private JTextField textField_022;
	private JTextField textField_023;
	private JTextField textField_030;
	private JTextField textField_031;
	private JTextField textField_032;
	private JTextField textField_033;
	private JTextField textField_040;
	private JTextField textField_041;
	private JTextField textField_042;
	private JTextField textField_043;
	private JTextPane txtpnZmniejszenieSprzedayNetto;
	private JTextPane txtpnZmniejszeniePodatkuPtu;
	private JTextPane textPane_5;
	private JTextPane textPane_6;
	private JTextPane textPane_7;
	private JTextPane txtpnZaczonoParagon;
	private JTextPane txtpnKasaNr;
	private JTextField textField_79;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtWrocaw;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProtokolAnulowaniaSprzedazy window = new ProtokolAnulowaniaSprzedazy();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProtokolAnulowaniaSprzedazy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 660);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
	//	frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		JPanel menuBar = new MenuPanel();
		menuBar.setBounds(0, 0, 400, 20);
		frame.getContentPane().add(menuBar);
		
		JPanel infoPanel = new MainInfoPanel();
		infoPanel.setBounds(0, 30 , 640, 25);
		frame.getContentPane().add(infoPanel);
		
		JPanel reasonPanel = new ReasonInfoPanel();
		reasonPanel.setBounds(0, 60, 640, 25);
		frame.getContentPane().add(reasonPanel);
		
		panelMap = new HashMap<String,JPanel>();
		for (int i=1; i<8;i++) {
			JPanel productPanel = new ProductPanel();
			productPanel.setBounds(10, (i*20)+80 , 640, 25);
			frame.add(productPanel);
			panelMap.put("key"+i, productPanel);
		}
		
		JPanel sixthPanel = new JPanel();
		
	//	sixthPanel.add(comp)
		JTextPane txtpnZestawienie = new JTextPane();
		txtpnZestawienie.setBackground(UIManager.getColor("Button.background"));
		txtpnZestawienie.setText("Zestawienie sprzeda\u017Cy wg stawek VAT");
		txtpnZestawienie.setBounds(243, 308, 78, 48);
		frame.getContentPane().add(txtpnZestawienie);

		textField_000 = new JTextField();
		textField_000.setColumns(10);
		textField_000.setBounds(385, 306, 25, 20);
		frame.getContentPane().add(textField_000);

		textField_001 = new JTextField();
		textField_001.setColumns(10);
		textField_001.setBounds(408, 306, 60, 20);
		frame.getContentPane().add(textField_001);

		textField_002 = new JTextField();
		textField_002.setColumns(10);
		textField_002.setBounds(466, 306, 60, 20);
		frame.getContentPane().add(textField_002);

		textField_010 = new JTextField();
		textField_010.setColumns(10);
		textField_010.setBounds(385, 326, 25, 20);
		frame.getContentPane().add(textField_010);

		textField_011 = new JTextField();
		textField_011.setColumns(10);
		textField_011.setBounds(408, 326, 60, 20);
		frame.getContentPane().add(textField_011);

		textField_012 = new JTextField();
		textField_012.setColumns(10);
		textField_012.setBounds(466, 326, 60, 20);
		frame.getContentPane().add(textField_012);

		textField_020 = new JTextField();
		textField_020.setColumns(10);
		textField_020.setBounds(385, 346, 25, 20);
		frame.getContentPane().add(textField_020);

		textField_021 = new JTextField();
		textField_021.setColumns(10);
		textField_021.setBounds(408, 346, 60, 20);
		frame.getContentPane().add(textField_021);

		textField_022 = new JTextField();
		textField_022.setColumns(10);
		textField_022.setBounds(466, 346, 60, 20);
		frame.getContentPane().add(textField_022);

		textField_030 = new JTextField();
		textField_030.setColumns(10);
		textField_030.setBounds(385, 366, 25, 20);
		frame.getContentPane().add(textField_030);

		textField_031 = new JTextField();
		textField_031.setColumns(10);
		textField_031.setBounds(408, 366, 60, 20);
		frame.getContentPane().add(textField_031);

		textField_032 = new JTextField();
		textField_032.setColumns(10);
		textField_032.setBounds(466, 366, 60, 20);
		frame.getContentPane().add(textField_032);

		textField_040 = new JTextField();
		textField_040.setColumns(10);
		textField_040.setBounds(385, 386, 25, 20);
		frame.getContentPane().add(textField_040);

		textField_041 = new JTextField();
		textField_041.setColumns(10);
		textField_041.setBounds(408, 386, 60, 20);
		frame.getContentPane().add(textField_041);

		textField_042 = new JTextField();
		textField_042.setColumns(10);
		textField_042.setBounds(466, 386, 60, 20);
		frame.getContentPane().add(textField_042);

		textField_043 = new JTextField();
		textField_043.setBounds(10, 326, 208, 80);
		frame.getContentPane().add(textField_043);
		textField_043.setColumns(10);

		JTextPane txtpnUwagi = new JTextPane();
		txtpnUwagi.setBackground(UIManager.getColor("Button.background"));
		txtpnUwagi.setText("Uwagi:");
		txtpnUwagi.setBounds(10, 308, 230, 20);
		frame.getContentPane().add(txtpnUwagi);

		JTextPane txtpnWartociZ = new JTextPane();
		txtpnWartociZ.setBackground(UIManager.getColor("Button.background"));
		txtpnWartociZ.setText("Warto\u015Bci\u0105 z\u0142");
		txtpnWartociZ.setBounds(10, 463, 65, 20);
		frame.getContentPane().add(txtpnWartociZ);

		JTextPane txtpnSownie = new JTextPane();
		txtpnSownie.setBackground(UIManager.getColor("Button.background"));
		txtpnSownie.setText("s\u0142ownie:");
		txtpnSownie.setBounds(10, 484, 65, 15);
		frame.getContentPane().add(txtpnSownie);

		JTextPane textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane.setBounds(10, 501, 230, 20);
		frame.getContentPane().add(textPane);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(81, 463, 60, 1);
		frame.getContentPane().add(textPane_1);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_2.setBounds(81, 464, 86, 20);
		frame.getContentPane().add(textPane_2);

		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_3.setBounds(408, 411, 60, 20);
		frame.getContentPane().add(textPane_3);

		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_4.setBounds(466, 411, 60, 20);
		frame.getContentPane().add(textPane_4);

		JTextPane txtpncznaWartoProtokou = new JTextPane();
		txtpncznaWartoProtokou.setBackground(UIManager.getColor("Button.background"));
		txtpncznaWartoProtokou.setText("\u0141\u0105czna warto\u015B\u0107 protoko\u0142u");
		txtpncznaWartoProtokou.setBounds(356, 432, 170, 20);
		frame.getContentPane().add(txtpncznaWartoProtokou);

		JTextPane txtpnZmniejszenieSprzedayBrutto = new JTextPane();
		txtpnZmniejszenieSprzedayBrutto.setBackground(UIManager.getColor("Button.background"));
		txtpnZmniejszenieSprzedayBrutto.setText("Zmniejszenie sprzeda\u017Cy brutto");
		txtpnZmniejszenieSprzedayBrutto.setBounds(294, 463, 181, 20);
		frame.getContentPane().add(txtpnZmniejszenieSprzedayBrutto);

		txtpnZmniejszenieSprzedayNetto = new JTextPane();
		txtpnZmniejszenieSprzedayNetto.setBackground(UIManager.getColor("Button.background"));
		txtpnZmniejszenieSprzedayNetto.setText("Zmniejszenie sprzeda\u017Cy netto");
		txtpnZmniejszenieSprzedayNetto.setBounds(294, 503, 181, 20);
		frame.getContentPane().add(txtpnZmniejszenieSprzedayNetto);

		txtpnZmniejszeniePodatkuPtu = new JTextPane();
		txtpnZmniejszeniePodatkuPtu.setBackground(UIManager.getColor("Button.background"));
		txtpnZmniejszeniePodatkuPtu.setText("Zmniejszenie podatku PTU");
		txtpnZmniejszeniePodatkuPtu.setBounds(294, 483, 181, 20);
		frame.getContentPane().add(txtpnZmniejszeniePodatkuPtu);

		textPane_5 = new JTextPane();
		textPane_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_5.setBounds(485, 463, 41, 20);
		frame.getContentPane().add(textPane_5);

		textPane_6 = new JTextPane();
		textPane_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_6.setBounds(485, 483, 41, 20);
		frame.getContentPane().add(textPane_6);

		textPane_7 = new JTextPane();
		textPane_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_7.setBounds(485, 503, 41, 20);
		frame.getContentPane().add(textPane_7);

		txtpnZaczonoParagon = new JTextPane();
		txtpnZaczonoParagon.setBackground(UIManager.getColor("Button.background"));
		txtpnZaczonoParagon.setText("Za\u0142\u0105czono paragon nr");
		txtpnZaczonoParagon.setBounds(9, 578, 120, 20);
		frame.getContentPane().add(txtpnZaczonoParagon);

		txtpnKasaNr = new JTextPane();
		txtpnKasaNr.setBackground(UIManager.getColor("Button.background"));
		txtpnKasaNr.setText("Kasa nr");
		txtpnKasaNr.setBounds(9, 602, 52, 20);
		frame.getContentPane().add(txtpnKasaNr);

		textField_79 = new JTextField();
		textField_79.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField_79.setBounds(131, 578, 86, 20);
		frame.getContentPane().add(textField_79);
		textField_79.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(67, 602, 150, 20);
		frame.getContentPane().add(comboBox);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(326, 306, 60, 20);
		frame.getContentPane().add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(326, 386, 60, 20);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(326, 366, 60, 20);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(326, 346, 60, 20);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(326, 326, 60, 20);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(326, 411, 60, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNaleyUznaKasjera = new JLabel("Nale\u017Cy uzna\u0107 kasjera:");
		lblNaleyUznaKasjera.setBounds(10, 530, 120, 20);
		frame.getContentPane().add(lblNaleyUznaKasjera);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(119, 532, 123, 22);
		frame.getContentPane().add(comboBox_1);
		
		
		
	}
}