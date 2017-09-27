package protokolAnulowaniaSprzedazy;

import java.awt.EventQueue;

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
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ProtokolAnulowaniaSprzedazy {

	private JFrame frame;
	private JTextField textField_00;
	private JTextField textField_01;
	private JTextField textField_02;
	private JTextField textField_03;
	private JTextField textField_04;
	private JTextField textField_05;
	private JTextField textField_06;
	private JTextField textField_07;
	private JTextField textField_08;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
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
		frame.setBounds(100, 100, 544, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_00 = new JTextField();
		textField_00.setText("1");
		textField_00.setBounds(10, 72, 25, 20);
		frame.getContentPane().add(textField_00);
		textField_00.setColumns(10);
		
		textField_01 = new JTextField();
		textField_01.setBounds(37, 72, 181, 20);
		frame.getContentPane().add(textField_01);
		textField_01.setColumns(10);
		
		textField_02 = new JTextField();
		textField_02.setBounds(217, 72, 25, 20);
		frame.getContentPane().add(textField_02);
		textField_02.setColumns(10);
		
		textField_03 = new JTextField();
		textField_03.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				if (hasDouble(textField_04)&&hasDouble(textField_03)) {
					textField_05.setText(String.valueOf(multiplication(textField_03,textField_04)));
				}
			}
		});
		textField_03.setBounds(243, 72, 25, 20);
		frame.getContentPane().add(textField_03);
		textField_03.setColumns(10);
		
		textField_04 = new JTextField();
		textField_04.setBounds(268, 72, 60, 20);
		frame.getContentPane().add(textField_04);
		textField_04.setColumns(10);
		
		textField_05 = new JTextField();
		textField_05.setBounds(326, 72, 60, 20);
		frame.getContentPane().add(textField_05);
		textField_05.setColumns(10);
		
		textField_06 = new JTextField();
		textField_06.setBounds(385, 71, 25, 20);
		frame.getContentPane().add(textField_06);
		textField_06.setColumns(10);
		
		textField_07 = new JTextField();
		textField_07.setBounds(408, 72, 60, 20);
		frame.getContentPane().add(textField_07);
		textField_07.setColumns(10);
		
		textField_08 = new JTextField();
		textField_08.setBounds(466, 72, 60, 20);
		frame.getContentPane().add(textField_08);
		textField_08.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 92, 25, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(37, 92, 181, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(217, 92, 25, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(243, 92, 25, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(268, 92, 60, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(326, 92, 60, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(385, 91, 25, 20);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(408, 92, 60, 20);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(466, 92, 60, 20);
		frame.getContentPane().add(textField_18);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(10, 112, 25, 20);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(37, 112, 181, 20);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(217, 112, 25, 20);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(243, 112, 25, 20);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(268, 112, 60, 20);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(326, 112, 60, 20);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(385, 111, 25, 20);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(408, 112, 60, 20);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(466, 112, 60, 20);
		frame.getContentPane().add(textField_28);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(10, 132, 25, 20);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(37, 132, 181, 20);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(217, 132, 25, 20);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(243, 132, 25, 20);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(268, 132, 60, 20);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(326, 132, 60, 20);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(385, 131, 25, 20);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(408, 132, 60, 20);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(466, 132, 60, 20);
		frame.getContentPane().add(textField_38);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(10, 152, 25, 20);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(37, 152, 181, 20);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(217, 152, 25, 20);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(243, 152, 25, 20);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(268, 152, 60, 20);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(326, 152, 60, 20);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(385, 151, 25, 20);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(408, 152, 60, 20);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(466, 152, 60, 20);
		frame.getContentPane().add(textField_48);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(10, 171, 25, 20);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(37, 172, 181, 20);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(217, 171, 25, 20);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(243, 171, 25, 20);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(268, 172, 60, 20);
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(326, 171, 60, 20);
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(385, 171, 25, 20);
		frame.getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(408, 172, 60, 20);
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(466, 172, 60, 20);
		frame.getContentPane().add(textField_58);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(10, 191, 25, 20);
		frame.getContentPane().add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(37, 192, 181, 20);
		frame.getContentPane().add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(217, 191, 25, 20);
		frame.getContentPane().add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(243, 191, 25, 20);
		frame.getContentPane().add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(268, 191, 60, 20);
		frame.getContentPane().add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(326, 191, 60, 20);
		frame.getContentPane().add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(385, 191, 25, 20);
		frame.getContentPane().add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(408, 192, 60, 20);
		frame.getContentPane().add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(466, 192, 60, 20);
		frame.getContentPane().add(textField_68);
		
		JTextPane txtpnNazwaProduktu = new JTextPane();
		txtpnNazwaProduktu.setBackground(UIManager.getColor("Button.background"));
		txtpnNazwaProduktu.setText("Nazwa produktu");
		txtpnNazwaProduktu.setBounds(33, 39, 86, 31);
		frame.getContentPane().add(txtpnNazwaProduktu);
		
		JTextPane txtpnLp = new JTextPane();
		txtpnLp.setBackground(UIManager.getColor("Button.background"));
		txtpnLp.setText("L.p.");
		txtpnLp.setBounds(10, 39, 25, 31);
		frame.getContentPane().add(txtpnLp);
		
		JTextPane txtpnJm = new JTextPane();
		txtpnJm.setBackground(UIManager.getColor("Button.background"));
		txtpnJm.setText("J.m.");
		txtpnJm.setBounds(217, 39, 25, 31);
		frame.getContentPane().add(txtpnJm);
		
		JTextPane txtpnIlo = new JTextPane();
		txtpnIlo.setBackground(UIManager.getColor("Button.background"));
		txtpnIlo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtpnIlo.setText("Ilo\u015B\u0107");
		txtpnIlo.setBounds(243, 39, 25, 31);
		frame.getContentPane().add(txtpnIlo);
		
		JTextPane txtpnCenaJednostkowaZ = new JTextPane();
		txtpnCenaJednostkowaZ.setBackground(UIManager.getColor("Button.background"));
		txtpnCenaJednostkowaZ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtpnCenaJednostkowaZ.setText("Cena jednostkowa z podatkiem");
		txtpnCenaJednostkowaZ.setBounds(266, 30, 60, 40);
		frame.getContentPane().add(txtpnCenaJednostkowaZ);
		
		JTextPane txtpnWartoZPodatkiem = new JTextPane();
		txtpnWartoZPodatkiem.setBackground(UIManager.getColor("Button.background"));
		txtpnWartoZPodatkiem.setText("Warto\u015B\u0107 z podatkiem");
		txtpnWartoZPodatkiem.setBounds(326, 39, 60, 31);
		frame.getContentPane().add(txtpnWartoZPodatkiem);
		
		JTextPane txtpnVat = new JTextPane();
		txtpnVat.setBackground(UIManager.getColor("Button.background"));
		txtpnVat.setText("%");
		txtpnVat.setBounds(385, 55, 25, 15);
		frame.getContentPane().add(txtpnVat);
		
		JTextPane txtpnWTymPodatek = new JTextPane();
		txtpnWTymPodatek.setBackground(UIManager.getColor("Button.background"));
		txtpnWTymPodatek.setText("W tym podatek");
		txtpnWTymPodatek.setBounds(385, 39, 83, 20);
		frame.getContentPane().add(txtpnWTymPodatek);
		
		JTextPane txtpnKwota = new JTextPane();
		txtpnKwota.setBackground(UIManager.getColor("Button.background"));
		txtpnKwota.setText("Kwota");
		txtpnKwota.setBounds(408, 55, 41, 15);
		frame.getContentPane().add(txtpnKwota);
		
		JTextPane txtpnWarto = new JTextPane();
		txtpnWarto.setBackground(UIManager.getColor("Button.background"));
		txtpnWarto.setText("Warto\u015B\u0107 bez podatku");
		txtpnWarto.setBounds(466, 39, 65, 31);
		frame.getContentPane().add(txtpnWarto);
		
		JTextPane txtpnZestawienie = new JTextPane();
		txtpnZestawienie.setBackground(UIManager.getColor("Button.background"));
		txtpnZestawienie.setText("Zestawienie sprzeda\u017Cy wg stawek VAT");
		txtpnZestawienie.setBounds(243, 222, 78, 48);
		frame.getContentPane().add(txtpnZestawienie);
		
		textField_000 = new JTextField();
		textField_000.setColumns(10);
		textField_000.setBounds(385, 220, 25, 20);
		frame.getContentPane().add(textField_000);
		
		textField_001 = new JTextField();
		textField_001.setColumns(10);
		textField_001.setBounds(408, 220, 60, 20);
		frame.getContentPane().add(textField_001);
		
		textField_002 = new JTextField();
		textField_002.setColumns(10);
		textField_002.setBounds(466, 220, 60, 20);
		frame.getContentPane().add(textField_002);
		
		textField_010 = new JTextField();
		textField_010.setColumns(10);
		textField_010.setBounds(385, 240, 25, 20);
		frame.getContentPane().add(textField_010);
		
		textField_011 = new JTextField();
		textField_011.setColumns(10);
		textField_011.setBounds(408, 240, 60, 20);
		frame.getContentPane().add(textField_011);
		
		textField_012 = new JTextField();
		textField_012.setColumns(10);
		textField_012.setBounds(466, 240, 60, 20);
		frame.getContentPane().add(textField_012);
		
		textField_020 = new JTextField();
		textField_020.setColumns(10);
		textField_020.setBounds(385, 260, 25, 20);
		frame.getContentPane().add(textField_020);
		
		textField_021 = new JTextField();
		textField_021.setColumns(10);
		textField_021.setBounds(408, 260, 60, 20);
		frame.getContentPane().add(textField_021);
		
		textField_022 = new JTextField();
		textField_022.setColumns(10);
		textField_022.setBounds(466, 260, 60, 20);
		frame.getContentPane().add(textField_022);
		
		textField_030 = new JTextField();
		textField_030.setColumns(10);
		textField_030.setBounds(385, 280, 25, 20);
		frame.getContentPane().add(textField_030);
		
		textField_031 = new JTextField();
		textField_031.setColumns(10);
		textField_031.setBounds(408, 280, 60, 20);
		frame.getContentPane().add(textField_031);
		
		textField_032 = new JTextField();
		textField_032.setColumns(10);
		textField_032.setBounds(466, 280, 60, 20);
		frame.getContentPane().add(textField_032);
		
		textField_040 = new JTextField();
		textField_040.setColumns(10);
		textField_040.setBounds(385, 300, 25, 20);
		frame.getContentPane().add(textField_040);
		
		textField_041 = new JTextField();
		textField_041.setColumns(10);
		textField_041.setBounds(408, 300, 60, 20);
		frame.getContentPane().add(textField_041);
		
		textField_042 = new JTextField();
		textField_042.setColumns(10);
		textField_042.setBounds(466, 300, 60, 20);
		frame.getContentPane().add(textField_042);
		
		textField_043 = new JTextField();
		textField_043.setBounds(10, 240, 208, 40);
		frame.getContentPane().add(textField_043);
		textField_043.setColumns(10);
		
		JTextPane txtpnUwagi = new JTextPane();
		txtpnUwagi.setBackground(UIManager.getColor("Button.background"));
		txtpnUwagi.setText("Uwagi:");
		txtpnUwagi.setBounds(10, 222, 230, 20);
		frame.getContentPane().add(txtpnUwagi);
		
		JTextPane txtpnWartociZ = new JTextPane();
		txtpnWartociZ.setBackground(UIManager.getColor("Button.background"));
		txtpnWartociZ.setText("Warto\u015Bci\u0105 z\u0142");
		txtpnWartociZ.setBounds(10, 279, 65, 15);
		frame.getContentPane().add(txtpnWartociZ);
		
		JTextPane txtpnSownie = new JTextPane();
		txtpnSownie.setBackground(UIManager.getColor("Button.background"));
		txtpnSownie.setText("s\u0142ownie:");
		txtpnSownie.setBounds(10, 300, 65, 15);
		frame.getContentPane().add(txtpnSownie);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane.setBounds(10, 317, 230, 20);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(81, 279, 60, 1);
		frame.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_2.setBounds(81, 280, 86, 20);
		frame.getContentPane().add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_3.setBounds(408, 325, 60, 20);
		frame.getContentPane().add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_4.setBounds(466, 325, 60, 20);
		frame.getContentPane().add(textPane_4);
		
		JTextPane txtpncznaWartoProtokou = new JTextPane();
		txtpncznaWartoProtokou.setBackground(UIManager.getColor("Button.background"));
		txtpncznaWartoProtokou.setText("\u0141\u0105czna warto\u015B\u0107 protoko\u0142u");
		txtpncznaWartoProtokou.setBounds(356, 346, 170, 20);
		frame.getContentPane().add(txtpncznaWartoProtokou);
		
		JTextPane txtpnZmniejszenieSprzedayBrutto = new JTextPane();
		txtpnZmniejszenieSprzedayBrutto.setBackground(UIManager.getColor("Button.background"));
		txtpnZmniejszenieSprzedayBrutto.setText("Zmniejszenie sprzeda\u017Cy brutto");
		txtpnZmniejszenieSprzedayBrutto.setBounds(10, 360, 181, 20);
		frame.getContentPane().add(txtpnZmniejszenieSprzedayBrutto);
		
		txtpnZmniejszenieSprzedayNetto = new JTextPane();
		txtpnZmniejszenieSprzedayNetto.setBackground(UIManager.getColor("Button.background"));
		txtpnZmniejszenieSprzedayNetto.setText("Zmniejszenie sprzeda\u017Cy netto");
		txtpnZmniejszenieSprzedayNetto.setBounds(10, 400, 181, 20);
		frame.getContentPane().add(txtpnZmniejszenieSprzedayNetto);
		
		txtpnZmniejszeniePodatkuPtu = new JTextPane();
		txtpnZmniejszeniePodatkuPtu.setBackground(UIManager.getColor("Button.background"));
		txtpnZmniejszeniePodatkuPtu.setText("Zmniejszenie podatku PTU");
		txtpnZmniejszeniePodatkuPtu.setBounds(10, 380, 181, 20);
		frame.getContentPane().add(txtpnZmniejszeniePodatkuPtu);
		
		textPane_5 = new JTextPane();
		textPane_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_5.setBounds(201, 360, 41, 20);
		frame.getContentPane().add(textPane_5);
		
		textPane_6 = new JTextPane();
		textPane_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_6.setBounds(201, 380, 41, 20);
		frame.getContentPane().add(textPane_6);
		
		textPane_7 = new JTextPane();
		textPane_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_7.setBounds(201, 400, 41, 20);
		frame.getContentPane().add(textPane_7);
		
		txtpnZaczonoParagon = new JTextPane();
		txtpnZaczonoParagon.setBackground(UIManager.getColor("Button.background"));
		txtpnZaczonoParagon.setText("Za\u0142\u0105czono paragon nr");
		txtpnZaczonoParagon.setBounds(10, 431, 120, 20);
		frame.getContentPane().add(txtpnZaczonoParagon);
		
		txtpnKasaNr = new JTextPane();
		txtpnKasaNr.setBackground(UIManager.getColor("Button.background"));
		txtpnKasaNr.setText("Kasa nr");
		txtpnKasaNr.setBounds(10, 455, 52, 20);
		frame.getContentPane().add(txtpnKasaNr);
		
		textField_79 = new JTextField();
		textField_79.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField_79.setBounds(132, 431, 86, 20);
		frame.getContentPane().add(textField_79);
		textField_79.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(68, 455, 150, 20);
		frame.getContentPane().add(comboBox);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 141, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Plik");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNowy = new JMenuItem("Nowy");
		mnNewMenu.add(mntmNowy);
		
		JMenuItem mntmOtwrz = new JMenuItem("Otw\u00F3rz");
		mnNewMenu.add(mntmOtwrz);
		
		JMenuItem mntmZamknij = new JMenuItem("Zamknij");
		mnNewMenu.add(mntmZamknij);
		
		JMenu mnNewMenu_1 = new JMenu("Ustawienia");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmBazaProduktw = new JMenuItem("Baza produkt\u00F3w");
		mnNewMenu_1.add(mntmBazaProduktw);
		
		JMenuItem mntmKasjerzy = new JMenuItem("Kasjerzy");
		mnNewMenu_1.add(mntmKasjerzy);
		
		JMenuItem mntmEdycjaKasFiskalnych = new JMenuItem("Kasy fiskalne");
		mnNewMenu_1.add(mntmEdycjaKasFiskalnych);
		
		JMenu mnPomoc = new JMenu("Pomoc");
		menuBar.add(mnPomoc);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(326, 220, 60, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(326, 300, 60, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(326, 280, 60, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(326, 260, 60, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(326, 240, 60, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(326, 325, 60, 20);
		frame.getContentPane().add(textField_5);
	}
	public boolean hasDouble(JTextField jT) {
		double d;
		try {
			d = Double.parseDouble(jT.getText());
		}
		catch (NumberFormatException e) {
			return false;
	}
		return true;
	}
	public double multiplication(JTextField jTF1,JTextField jTF2) {
		double d1,d2;
		d1= Double.parseDouble(jTF1.getText());
		d2= Double.parseDouble(jTF2.getText());
		return d1*d2;
	}
}

