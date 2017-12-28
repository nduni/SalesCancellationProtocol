package ui.panels.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import ui.panels.InWordsPanel;
import ui.panels.ReciepeAndTillPanel;
public class MenuPanel extends JPanel {
	private JFrame mainFrame;
	private InWordsPanel inWords;
	private ReciepeAndTillPanel ratPanel;
	
	public MenuPanel(JFrame mainFrame, InWordsPanel inWords, ReciepeAndTillPanel ratPanel) {
		super();
		this.mainFrame = mainFrame;
		this.inWords=inWords;
		this.ratPanel=ratPanel;
		createComponents();
	}

	private void createComponents() {
		setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 160, 20);
		add(menuBar);
		JMenu mnNewMenu = new JMenu("Plik");
		menuBar.add(mnNewMenu);

		JMenuItem newProtocol = new JMenuItem("Nowy");
		mnNewMenu.add(newProtocol);

		JMenuItem open = new JMenuItem("Otw\u00F3rz");
		mnNewMenu.add(open);

		JMenuItem close = new JMenuItem("Zamknij");
		mnNewMenu.add(close);
		

		JMenu settings = new JMenu("Ustawienia");
		menuBar.add(settings);

		JMenuItem productsSource = new JMenuItem("Baza produkt\u00F3w");
		settings.add(productsSource);

		JMenuItem cashiersManager = new JMenuItem("Kasjerzy");
		cashiersManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				manageCashierFrame();
			}
		});
		settings.add(cashiersManager);

		JMenuItem tillsManager = new JMenuItem("Kasy fiskalne");
		tillsManager.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				openTillsManager();				
			}
		});
		settings.add(tillsManager);

		JMenu help = new JMenu("Pomoc");
		menuBar.add(help);
	}

	private void manageCashierFrame() {
		CashiersManager manager = new CashiersManager(mainFrame, inWords );
	}
	private void openTillsManager() {
		TillManager manager = new TillManager(mainFrame, ratPanel);
		
	}
}
