package ui.panels.Menu;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ui.panels.InWordsPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MenuPanel extends JPanel {
	private JFrame mainFrame;
	private InWordsPanel inWords;
	
	public MenuPanel(JFrame mainFrame, InWordsPanel inWords) {
		super();
		this.mainFrame = mainFrame;
		this.inWords=inWords;
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
		TillSManager manager = new TillSManager();
		
	}
}
