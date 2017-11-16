package ui;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import ui.panels.CommentsPanel;
import ui.panels.InWordsPanel;
import ui.panels.MainInfoPanel;
import ui.panels.ProductPanel;
import ui.panels.ProductPanelLabels;
import ui.panels.ReciepeAndTillPanel;
import ui.panels.TotalSummaryPanel;
import ui.panels.VatSummaryPanel;
import ui.panels.Menu.MenuPanel;
import ui.panels.ReasonInfoPanel.ReasonInfoPanel;

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

public class MainFrame {

	private JFrame frame;
	// private Map<String, JPanel> panelMap;
	private static ArrayList<ProductPanel> productPanels;
	private VatSummaryPanel vatSummaryPanel;
	private MenuPanel menuBar;
	private MainInfoPanel infoPanel;
	private ReasonInfoPanel reasonPanel;
	private JPanel sixthPanel;
	private CommentsPanel commentsPanel;
	private JPanel seventhPanel;
	private TotalSummaryPanel totalSummary;
	private InWordsPanel inWordsPanel;
	private ReciepeAndTillPanel reciepeAndTillPanel;
	private ProductPanelLabels productPanelLabels;

	public MainFrame() {
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
		frame.setVisible(true);
		inWordsPanel = new InWordsPanel();
		menuBar = new MenuPanel(frame, inWordsPanel);
		menuBar.setBounds(0, 0, 400, 20);
		frame.getContentPane().add(menuBar);

		infoPanel = new MainInfoPanel();
		infoPanel.setBounds(0, 30, 640, 25);
		frame.getContentPane().add(infoPanel);

		reasonPanel = new ReasonInfoPanel();
		reasonPanel.setBounds(0, 60, 640, 25);
		frame.getContentPane().add(reasonPanel);
		productPanelLabels = new ProductPanelLabels();
		productPanelLabels.setBounds(10, 85, 640, 48);
		frame.getContentPane().add(productPanelLabels);
		// panelMap = new HashMap<String, JPanel>();
		productPanels = new ArrayList<ProductPanel>();
		vatSummaryPanel = new VatSummaryPanel(productPanels);
		for (int i = 1; i < 8; i++) {
			JPanel productPanel = new ProductPanel(vatSummaryPanel);
			productPanel.setBounds(10, (i * 20) + 110, 640, 25);
			frame.getContentPane().add(productPanel);
			// panelMap.put("key" + i, productPanel);
			productPanels.add((ProductPanel) productPanel);
		}

		sixthPanel = new JPanel();
		commentsPanel = new CommentsPanel();

		sixthPanel.setBounds(0, 300, 640, 100);
		sixthPanel.setLayout(new BoxLayout(sixthPanel, BoxLayout.X_AXIS));

		sixthPanel.add(commentsPanel);
		sixthPanel.add(vatSummaryPanel);
		frame.getContentPane().add(sixthPanel);

		seventhPanel = new JPanel();
		totalSummary = new TotalSummaryPanel();

		seventhPanel.setBounds(0, 400, 640, 130);
		seventhPanel.setLayout(new BoxLayout(seventhPanel, BoxLayout.X_AXIS));
		seventhPanel.add(inWordsPanel);
		seventhPanel.add(totalSummary);
		frame.getContentPane().add(seventhPanel);

		reciepeAndTillPanel = new ReciepeAndTillPanel();
		reciepeAndTillPanel.setBounds(0, 530, 640, 40);
		frame.getContentPane().add(reciepeAndTillPanel);

	}

	public static ArrayList<ProductPanel> getPanels() {
		return productPanels;
	}

	public JPanel getInWords() {
		return inWordsPanel;
	}

}