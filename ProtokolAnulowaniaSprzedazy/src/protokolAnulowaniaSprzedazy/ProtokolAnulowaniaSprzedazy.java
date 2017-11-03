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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.Component;
import javax.swing.JLabel;

public class ProtokolAnulowaniaSprzedazy {

	private JFrame frame;
	private Map<String, JPanel> panelMap;
	private ArrayList<JPanel> panels;

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
		panels = new ArrayList<JPanel>();
		for (int i = 1; i < 8; i++) {
			JPanel productPanel = new ProductPanel();
			productPanel.setBounds(10, (i * 20) + 80, 640, 25);
			frame.getContentPane().add(productPanel);
			panelMap.put("key" + i, productPanel);
			panels.add(productPanel);
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

	}
}