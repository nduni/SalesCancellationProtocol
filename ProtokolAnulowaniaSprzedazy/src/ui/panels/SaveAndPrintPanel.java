package ui.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.print.PrintException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.itextpdf.text.DocumentException;
import com.jgoodies.forms.builder.ButtonBarBuilder;

import controller.PdfActionListener;
import document.PdfCreator;
import model.FrameReferences;
import ui.panels.ProductPanel.ProductPanel;
import ui.panels.ReasonInfoPanel.ReasonInfoPanel;

public class SaveAndPrintPanel extends JPanel {
	private JButton saveToPdf;
	private JButton printDocument;
	private ArrayList<ProductPanel> panels;
	private MainInfoPanel infoPanel;
	private ReasonInfoPanel reasonPanel;
	private CommentsPanel commentsPanel;
	private ProductPanelLabels productPanelLabels;
	private TotalSummaryPanel totalSummary;
	private VatSummaryPanel vatSummaryPanel;
	private ReciepeAndTillPanel reciepeAndTillPanel;
	private InWordsPanel inWordsPanel;

	public SaveAndPrintPanel(MainInfoPanel infoPanel, ReasonInfoPanel reasonPanel, CommentsPanel commentsPanel,
			ProductPanelLabels productPanelLabels, TotalSummaryPanel totalSummary, VatSummaryPanel vatSummaryPanel,
			ReciepeAndTillPanel reciepeAndTillPanel, InWordsPanel inWordsPanel) {
		super();
		this.infoPanel = infoPanel;
		this.reasonPanel = reasonPanel;
		this.commentsPanel = commentsPanel;
		this.productPanelLabels = productPanelLabels;
		this.totalSummary = totalSummary;
		this.vatSummaryPanel = vatSummaryPanel;
		this.reciepeAndTillPanel = reciepeAndTillPanel;
		this.inWordsPanel = inWordsPanel;
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		saveToPdf = new JButton("Zapisz do PDF");
		saveToPdf.setBounds(10, 10, 130, 20);
		PdfActionListener pdfActionListener = new PdfActionListener(this);
		saveToPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser dialog = new JFileChooser();
				int dialogResult = dialog.showSaveDialog(null);
				if (dialogResult == JFileChooser.APPROVE_OPTION) {
					String filePath = dialog.getSelectedFile().getPath();
					if (!filePath.endsWith(".pdf")) {
						filePath += ".pdf";
					}
					try {
						FrameReferences pdf = new FrameReferences.ReferncesBuilder()
								.setInfoPanel(infoPanel)
								.setReasonPanel(reasonPanel)
								.setCommentsPanel(commentsPanel)
								.setProductPanelLabels(productPanelLabels)
								.setTotalSummary(totalSummary)
								.setVatSummaryPanel(vatSummaryPanel)
								.setReciepeAndTillPanel(reciepeAndTillPanel)
								.setInWordsPanel(inWordsPanel)
								.buildPdf();
						PdfCreator pdfCreator= new PdfCreator(filePath, pdf);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null,
								"Nie mo¿na zapisaæ pliku. Sprawd\u017a czy nie jest u¿ywany");

					} catch (DocumentException e1) {
						JOptionPane.showMessageDialog(null, "Nie mo¿na zapisaæ pliku");
					}
				}
			}
		});
		add(saveToPdf);
		printDocument = new JButton("Drukuj");
		printDocument.setBounds(150, 10, 130, 20);
		printDocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FrameReferences frameReferences = new FrameReferences.ReferncesBuilder()
							.setInfoPanel(infoPanel)
							.setReasonPanel(reasonPanel)
							.setCommentsPanel(commentsPanel)
							.setProductPanelLabels(productPanelLabels)
							.setTotalSummary(totalSummary)
							.setVatSummaryPanel(vatSummaryPanel)
							.setReciepeAndTillPanel(reciepeAndTillPanel)
							.setInWordsPanel(inWordsPanel)
							.buildPdf();
					PdfCreator pdfCreator= new PdfCreator(frameReferences);
				} catch (DocumentException e1) {
					JOptionPane.showMessageDialog(null, "Problem z formatowaniem pliku we/wyj");
				} catch (PrintException e1) {
					e1.printStackTrace();
				}
			}
		});
		add(printDocument);
	}
}
