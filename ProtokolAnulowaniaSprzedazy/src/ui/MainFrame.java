package ui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.itextpdf.text.DocumentException;

import document.PdfCreator;
import ui.panels.CommentsPanel;
import ui.panels.InWordsPanel;
import ui.panels.SaveAndPrintPanel;
import ui.panels.MainInfoPanel;
import ui.panels.ProductPanelLabels;
import ui.panels.ReciepeAndTillPanel;
import ui.panels.TotalSummaryPanel;
import ui.panels.VatSummaryPanel;
import ui.panels.Menu.MenuPanel;
import ui.panels.ProductPanel.ProductPanel;
import ui.panels.ReasonInfoPanel.ReasonInfoPanel;

public class MainFrame {

	private JFrame frame;
	// private Map<String, JPanel> panelMap;
	private static ArrayList<ProductPanel> productPanels;
	private VatSummaryPanel vatSummaryPanel;
	private MenuPanel menuBar;
	private MainInfoPanel infoPanel;
	private ReasonInfoPanel reasonPanel;
	private JPanel commentAndVatSummaryPanel;
	private CommentsPanel commentsPanel;
	private JPanel totalSummaryAndInWordsPanel;
	private TotalSummaryPanel totalSummary;
	private InWordsPanel inWordsPanel;
	private ReciepeAndTillPanel reciepeAndTillPanel;
	private ProductPanelLabels productPanelLabels;
	private SaveAndPrintPanel savePrintPanel;
	public MainFrame() throws IOException, DocumentException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	private void initialize() throws IOException, DocumentException {
		frame = new JFrame();
		frame.setBounds(100, 20, 640, 640);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		inWordsPanel = new InWordsPanel();
		reciepeAndTillPanel = new ReciepeAndTillPanel();
		menuBar = new MenuPanel(frame, inWordsPanel, reciepeAndTillPanel);
		infoPanel = new MainInfoPanel();
		reasonPanel = new ReasonInfoPanel();
		productPanels = new ArrayList<ProductPanel>();

		vatSummaryPanel = new VatSummaryPanel();
		commentAndVatSummaryPanel = new JPanel();
		commentsPanel = new CommentsPanel();
		productPanelLabels = new ProductPanelLabels();
		totalSummaryAndInWordsPanel = new JPanel();
		totalSummary = new TotalSummaryPanel(vatSummaryPanel);
		savePrintPanel = new SaveAndPrintPanel(infoPanel, reasonPanel, commentsPanel, productPanelLabels, totalSummary, vatSummaryPanel, reciepeAndTillPanel, inWordsPanel);

		menuBar.setBounds(0, 0, 400, 20);
		frame.getContentPane().add(menuBar);

		infoPanel.setBounds(0, 30, 640, 25);
		frame.getContentPane().add(infoPanel);

		reasonPanel.setBounds(0, 60, 640, 25);
		frame.getContentPane().add(reasonPanel);

		productPanelLabels.setBounds(10, 85, 640, 48);
		frame.getContentPane().add(productPanelLabels);
		// panelMap = new HashMap<String, JPanel>();

		for (int i = 1; i < 8; i++) {

			JPanel productPanel = new ProductPanel(vatSummaryPanel, inWordsPanel, totalSummary);
			productPanel.setBounds(10, (i * 20) + 110, 640, 25);
			frame.getContentPane().add(productPanel);
			// panelMap.put("key" + i, productPanel);
			productPanels.add((ProductPanel) productPanel);
		}
		
		commentAndVatSummaryPanel.setBounds(0, 300, 640, 100);
		commentAndVatSummaryPanel.setLayout(new BoxLayout(commentAndVatSummaryPanel, BoxLayout.X_AXIS));

		commentAndVatSummaryPanel.add(commentsPanel);
		commentAndVatSummaryPanel.add(vatSummaryPanel);
		frame.getContentPane().add(commentAndVatSummaryPanel);

		totalSummaryAndInWordsPanel.setBounds(0, 400, 640, 130);
		totalSummaryAndInWordsPanel.setLayout(new BoxLayout(totalSummaryAndInWordsPanel, BoxLayout.X_AXIS));
		totalSummaryAndInWordsPanel.add(inWordsPanel);
		totalSummaryAndInWordsPanel.add(totalSummary);
		frame.getContentPane().add(totalSummaryAndInWordsPanel);

		reciepeAndTillPanel.setBounds(0, 530, 640, 40);
		frame.getContentPane().add(reciepeAndTillPanel);
		
		savePrintPanel.setBounds(0, 570, 640, 30);
		frame.getContentPane().add(savePrintPanel);

	}

	public static ArrayList<ProductPanel> getProductPanels() {
		return productPanels;
	}

}