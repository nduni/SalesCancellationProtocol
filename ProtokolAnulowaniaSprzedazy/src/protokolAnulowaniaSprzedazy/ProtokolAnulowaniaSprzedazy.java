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
	private Map<String, JPanel> panelMap;
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
	private JTextPane txtpnDecreasingNetSales;
	private JTextPane txtpnDecreasingTax;
	private JTextPane textPane_5;
	private JTextPane textPane_6;
	private JTextPane textPane_7;
	private JTextPane txtpnReciepeAdded;
	private JTextPane txtpnTillNr;
	private JTextField textField_79;
	private JTextField textField;
	private JTextField textField_6;
	private JTextField txtWrocaw;
	private JTextField textField_7;
	private JPanel panel_1;
	private JPanel panel;

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
		frame.setBounds(100, 20, 640, 640);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		JPanel menuBar = new MenuPanel();
		menuBar.setBounds(0, 0, 400, 20);
		frame.getContentPane().add(menuBar);

		JPanel infoPanel = new MainInfoPanel();
		infoPanel.setBounds(0, 30, 640, 25);
		frame.getContentPane().add(infoPanel);

		JPanel reasonPanel = new ReasonInfoPanel();
		reasonPanel.setBounds(0, 60, 640, 25);
		frame.getContentPane().add(reasonPanel);

		panelMap = new HashMap<String, JPanel>();
		for (int i = 1; i < 8; i++) {
			JPanel productPanel = new ProductPanel();
			productPanel.setBounds(10, (i * 20) + 80, 640, 25);
			frame.getContentPane().add(productPanel);
			panelMap.put("key" + i, productPanel);
		}

		JPanel sixthPanel = new JPanel();
		JPanel commentsPanel = new CommentsPanel();
		JPanel vatSummaryPanel = new VatSummaryPanel();
		sixthPanel.setBounds(0, 300, 640, 100);
		sixthPanel.setLayout(new BoxLayout(sixthPanel, BoxLayout.X_AXIS));
		
		sixthPanel.add(commentsPanel);
		sixthPanel.add(vatSummaryPanel);
		frame.getContentPane().add(sixthPanel);

		JPanel seventhPanel = new JPanel();
		JPanel totalSummary = new TotalSummaryPanel();
		JPanel inWords = new InWordsPanel();
		seventhPanel.setBounds(0, 400, 640, 130);
		seventhPanel.setLayout(new BoxLayout(seventhPanel, BoxLayout.X_AXIS));
		seventhPanel.add(inWords);
		seventhPanel.add(totalSummary);
		frame.getContentPane().add(seventhPanel);
		
		JPanel reciepeAndTillPanel = new ReciepeAndTillPanel();
		reciepeAndTillPanel.setBounds(0, 530, 640, 40);
		frame.getContentPane().add(reciepeAndTillPanel);
		/**
		 * textField_010 = new JTextField(); textField_010.setColumns(10);
		 * textField_010.setBounds(385, 326, 25, 20);
		 * frame.getContentPane().add(textField_010);
		 * 
		 * textField_011 = new JTextField(); textField_011.setColumns(10);
		 * textField_011.setBounds(408, 326, 60, 20);
		 * frame.getContentPane().add(textField_011);
		 * 
		 * textField_012 = new JTextField(); textField_012.setColumns(10);
		 * textField_012.setBounds(466, 326, 60, 20);
		 * frame.getContentPane().add(textField_012);
		 * 
		 * textField_020 = new JTextField(); textField_020.setColumns(10);
		 * textField_020.setBounds(385, 346, 25, 20);
		 * frame.getContentPane().add(textField_020);
		 * 
		 * textField_021 = new JTextField(); textField_021.setColumns(10);
		 * textField_021.setBounds(408, 346, 60, 20);
		 * frame.getContentPane().add(textField_021);
		 * 
		 * textField_022 = new JTextField(); textField_022.setColumns(10);
		 * textField_022.setBounds(466, 346, 60, 20);
		 * frame.getContentPane().add(textField_022);
		 * 
		 * textField_030 = new JTextField(); textField_030.setColumns(10);
		 * textField_030.setBounds(385, 366, 25, 20);
		 * frame.getContentPane().add(textField_030);
		 * 
		 * textField_031 = new JTextField(); textField_031.setColumns(10);
		 * textField_031.setBounds(408, 366, 60, 20);
		 * frame.getContentPane().add(textField_031);
		 * 
		 * textField_032 = new JTextField(); textField_032.setColumns(10);
		 * textField_032.setBounds(466, 366, 60, 20);
		 * frame.getContentPane().add(textField_032);
		 * 
		 * textField_040 = new JTextField(); textField_040.setColumns(10);
		 * textField_040.setBounds(385, 386, 25, 20);
		 * frame.getContentPane().add(textField_040);
		 * 
		 * textField_041 = new JTextField(); textField_041.setColumns(10);
		 * textField_041.setBounds(408, 386, 60, 20);
		 * frame.getContentPane().add(textField_041);
		 * 
		 * textField_042 = new JTextField(); textField_042.setColumns(10);
		 * textField_042.setBounds(466, 386, 60, 20);
		 * frame.getContentPane().add(textField_042);
		 */

		
		


		

		

	}
}