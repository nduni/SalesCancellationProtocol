package ui.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.itextpdf.text.DocumentException;

import document.PdfCreator;
import ui.panels.ProductPanel.ProductPanel;
import ui.panels.ReasonInfoPanel.ReasonInfoPanel;

public class LastButtonPanel extends JPanel{
		private JButton saveToPdf;
		private ArrayList<ProductPanel> panels;
		private MainInfoPanel infoPanel;
		private ReasonInfoPanel reasonPanel;
		private CommentsPanel commentsPanel;
		private ProductPanelLabels productPanelLabels;
		private TotalSummaryPanel totalSummary;
		private VatSummaryPanel vatSummaryPanel;
		private ReciepeAndTillPanel reciepeAndTillPanel;
		private InWordsPanel inWordsPanel;

		public LastButtonPanel(MainInfoPanel infoPanel, ReasonInfoPanel reasonPanel, CommentsPanel commentsPanel,
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
			saveToPdf.addActionListener(new ActionListener() { 
				  public void actionPerformed(ActionEvent e) { 
					  JFileChooser dialog = new JFileChooser();
					 
			           int dialogResult = dialog.showSaveDialog(null);
			           
						     
			            if (dialogResult==JFileChooser.APPROVE_OPTION){
			                String filePath = dialog.getSelectedFile().getPath();
			                if (!filePath.endsWith(".pdf")){
			                	filePath += ".pdf";
			                }
					  try {
							PdfCreator pdf = new PdfCreator(filePath, infoPanel, reasonPanel, commentsPanel, productPanelLabels, totalSummary, vatSummaryPanel, reciepeAndTillPanel, inWordsPanel);
						} catch (IOException e1) {
							e1.printStackTrace();
						} catch (DocumentException e1) {
							e1.printStackTrace();
						}
			            }
				  }
					} );
			add(saveToPdf);
		}
}
