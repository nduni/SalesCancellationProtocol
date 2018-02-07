package model;

import ui.panels.CommentsPanel;
import ui.panels.InWordsPanel;
import ui.panels.MainInfoPanel;
import ui.panels.ProductPanelLabels;
import ui.panels.ReciepeAndTillPanel;
import ui.panels.TotalSummaryPanel;
import ui.panels.VatSummaryPanel;
import ui.panels.ReasonInfoPanel.ReasonInfoPanel;

public class FrameReferences {

	private  MainInfoPanel infoPanel;
	private  ReasonInfoPanel reasonPanel;
	private  CommentsPanel commentsPanel;
	private  ProductPanelLabels productPanelLabels;
	private  TotalSummaryPanel totalSummary;
	private  VatSummaryPanel vatSummaryPanel;
	private  ReciepeAndTillPanel reciepeAndTillPanel;
	private  InWordsPanel inWordsPanel;

	private FrameReferences() {
	}
	
	public FrameReferences(ReferncesBuilder pdfBuilder) {
		this.infoPanel = pdfBuilder.infoPanel;
		this.reasonPanel = pdfBuilder.reasonPanel;
		this.commentsPanel = pdfBuilder.commentsPanel;
		this.productPanelLabels = pdfBuilder.productPanelLabels;
		this.totalSummary = pdfBuilder.totalSummary;
		this.vatSummaryPanel = pdfBuilder.vatSummaryPanel;
		this.reciepeAndTillPanel = pdfBuilder.reciepeAndTillPanel;
		this.inWordsPanel = pdfBuilder.inWordsPanel;
	}

	public MainInfoPanel getInfoPanel() {
		return infoPanel;
	}
	public ReasonInfoPanel getReasonPanel() {
		return reasonPanel;
	}
	public CommentsPanel getCommentsPanel() {
		return commentsPanel;
	}
	public ProductPanelLabels getProductPanelLabels() {
		return productPanelLabels;
	}
	public TotalSummaryPanel getTotalSummary() {
		return totalSummary;
	}
	public VatSummaryPanel getVatSummaryPanel() {
		return vatSummaryPanel;
	}
	public ReciepeAndTillPanel getReciepeAndTillPanel() {
		return reciepeAndTillPanel;
	}
	public InWordsPanel getInWordsPanel() {
		return inWordsPanel;
	}
	
	public static class ReferncesBuilder {

		private MainInfoPanel infoPanel;
		private ReasonInfoPanel reasonPanel;
		private CommentsPanel commentsPanel;
		private ProductPanelLabels productPanelLabels;
		private TotalSummaryPanel totalSummary;
		private VatSummaryPanel vatSummaryPanel;
		private ReciepeAndTillPanel reciepeAndTillPanel;
		private InWordsPanel inWordsPanel;

		public ReferncesBuilder setInfoPanel(MainInfoPanel infoPanel) {
			this.infoPanel = infoPanel;
			return this;
		}
		public ReferncesBuilder setReasonPanel(ReasonInfoPanel reasonPanel) {
			this.reasonPanel = reasonPanel;
			return this;
		}
		public ReferncesBuilder setCommentsPanel(CommentsPanel commentsPanel) {
			this.commentsPanel = commentsPanel;
			return this;
		}
		public ReferncesBuilder setProductPanelLabels(ProductPanelLabels productPanelLabels) {
			this.productPanelLabels = productPanelLabels;
			return this;
		}
		public ReferncesBuilder setTotalSummary(TotalSummaryPanel totalSummary) {
			this.totalSummary = totalSummary;
			return this;
		}
		public ReferncesBuilder setVatSummaryPanel(VatSummaryPanel vatSummaryPanel) {
			this.vatSummaryPanel = vatSummaryPanel;
			return this;
		}
		public ReferncesBuilder setReciepeAndTillPanel(ReciepeAndTillPanel reciepeAndTillPanel) {
			this.reciepeAndTillPanel = reciepeAndTillPanel;
			return this;
		}
		public ReferncesBuilder setInWordsPanel(InWordsPanel inWordsPanel) {
			this.inWordsPanel = inWordsPanel;
			return this;
		}

		public FrameReferences buildPdf() {
			return new FrameReferences(this);
		}
	}
}
