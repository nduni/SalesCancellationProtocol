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

public class ProtokolAnulowaniaSprzedazy {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextPane txtpnZmniejszenieSprzedayNetto;
	private JTextPane txtpnZmniejszeniePodatkuPtu;
	private JTextPane textPane_5;
	private JTextPane textPane_6;
	private JTextPane textPane_7;
	private JTextPane txtpnZaczonoParagon;
	private JTextPane txtpnKasaNr;
	private JTextField textField_79;

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
		
		textField = new JTextField();
		textField.setBounds(10, 72, 25, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(37, 72, 82, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 72, 25, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 72, 25, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(164, 72, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(248, 72, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(332, 72, 25, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(356, 72, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(440, 72, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 92, 25, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(37, 92, 82, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(116, 92, 25, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(140, 92, 25, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(164, 92, 86, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(248, 92, 86, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(332, 92, 25, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(356, 92, 86, 20);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(440, 92, 86, 20);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(10, 112, 25, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(37, 112, 82, 20);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(116, 112, 25, 20);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(140, 112, 25, 20);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(164, 112, 86, 20);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(248, 112, 86, 20);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(332, 112, 25, 20);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(356, 112, 86, 20);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(440, 112, 86, 20);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(10, 132, 25, 20);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(37, 132, 82, 20);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(116, 132, 25, 20);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(140, 132, 25, 20);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(164, 132, 86, 20);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(248, 132, 86, 20);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(332, 132, 25, 20);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(356, 132, 86, 20);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(440, 132, 86, 20);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(10, 152, 25, 20);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(37, 152, 82, 20);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(116, 152, 25, 20);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(140, 152, 25, 20);
		frame.getContentPane().add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(164, 152, 86, 20);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(248, 152, 86, 20);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(332, 152, 25, 20);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(356, 152, 86, 20);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(440, 152, 86, 20);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(10, 171, 25, 20);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(37, 172, 82, 20);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(116, 172, 25, 20);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(140, 172, 25, 20);
		frame.getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(164, 172, 86, 20);
		frame.getContentPane().add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(248, 172, 86, 20);
		frame.getContentPane().add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(332, 172, 25, 20);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(356, 172, 86, 20);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(440, 172, 86, 20);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(10, 191, 25, 20);
		frame.getContentPane().add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(37, 192, 82, 20);
		frame.getContentPane().add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(116, 192, 25, 20);
		frame.getContentPane().add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(140, 192, 25, 20);
		frame.getContentPane().add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(164, 192, 86, 20);
		frame.getContentPane().add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(248, 192, 86, 20);
		frame.getContentPane().add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(332, 192, 25, 20);
		frame.getContentPane().add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(356, 192, 86, 20);
		frame.getContentPane().add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(440, 192, 86, 20);
		frame.getContentPane().add(textField_62);
		
		JTextPane txtpnNazwaProduktu = new JTextPane();
		txtpnNazwaProduktu.setText("Nazwa produktu");
		txtpnNazwaProduktu.setBounds(33, 39, 86, 31);
		frame.getContentPane().add(txtpnNazwaProduktu);
		
		JTextPane txtpnLp = new JTextPane();
		txtpnLp.setText("L.p.");
		txtpnLp.setBounds(10, 39, 25, 31);
		frame.getContentPane().add(txtpnLp);
		
		JTextPane txtpnJm = new JTextPane();
		txtpnJm.setText("J.m.");
		txtpnJm.setBounds(116, 39, 25, 31);
		frame.getContentPane().add(txtpnJm);
		
		JTextPane txtpnIlo = new JTextPane();
		txtpnIlo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtpnIlo.setText("Ilo\u015B\u0107");
		txtpnIlo.setBounds(140, 39, 25, 31);
		frame.getContentPane().add(txtpnIlo);
		
		JTextPane txtpnCenaJednostkowaZ = new JTextPane();
		txtpnCenaJednostkowaZ.setFont(new Font("Tahoma", Font.PLAIN, 8));
		txtpnCenaJednostkowaZ.setText("Cena jednostkowa z podatkiem");
		txtpnCenaJednostkowaZ.setBounds(164, 39, 86, 31);
		frame.getContentPane().add(txtpnCenaJednostkowaZ);
		
		JTextPane txtpnWartoZPodatkiem = new JTextPane();
		txtpnWartoZPodatkiem.setText("Warto\u015B\u0107 z podatkiem");
		txtpnWartoZPodatkiem.setBounds(248, 39, 86, 31);
		frame.getContentPane().add(txtpnWartoZPodatkiem);
		
		JTextPane txtpnVat = new JTextPane();
		txtpnVat.setText("%");
		txtpnVat.setBounds(332, 55, 25, 15);
		frame.getContentPane().add(txtpnVat);
		
		JTextPane txtpnWTymPodatek = new JTextPane();
		txtpnWTymPodatek.setText("W tym podatek");
		txtpnWTymPodatek.setBounds(332, 39, 110, 20);
		frame.getContentPane().add(txtpnWTymPodatek);
		
		JTextPane txtpnKwota = new JTextPane();
		txtpnKwota.setText("Kwota");
		txtpnKwota.setBounds(356, 55, 86, 15);
		frame.getContentPane().add(txtpnKwota);
		
		JTextPane txtpnWarto = new JTextPane();
		txtpnWarto.setText("Warto\u015B\u0107 bez podatku");
		txtpnWarto.setBounds(440, 39, 86, 31);
		frame.getContentPane().add(txtpnWarto);
		
		JTextPane txtpnZestawienie = new JTextPane();
		txtpnZestawienie.setText("Zestawienie sprzeda\u017Cy wg stawek VAT");
		txtpnZestawienie.setBounds(248, 222, 78, 97);
		frame.getContentPane().add(txtpnZestawienie);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(332, 220, 25, 20);
		frame.getContentPane().add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(356, 220, 86, 20);
		frame.getContentPane().add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(440, 220, 86, 20);
		frame.getContentPane().add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(332, 240, 25, 20);
		frame.getContentPane().add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(356, 240, 86, 20);
		frame.getContentPane().add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(440, 240, 86, 20);
		frame.getContentPane().add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(332, 260, 25, 20);
		frame.getContentPane().add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(356, 260, 86, 20);
		frame.getContentPane().add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(440, 260, 86, 20);
		frame.getContentPane().add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(332, 280, 25, 20);
		frame.getContentPane().add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(356, 280, 86, 20);
		frame.getContentPane().add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(440, 280, 86, 20);
		frame.getContentPane().add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(332, 300, 25, 20);
		frame.getContentPane().add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(356, 300, 86, 20);
		frame.getContentPane().add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(440, 300, 86, 20);
		frame.getContentPane().add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setBounds(10, 240, 230, 40);
		frame.getContentPane().add(textField_78);
		textField_78.setColumns(10);
		
		JTextPane txtpnUwagi = new JTextPane();
		txtpnUwagi.setText("Uwagi:");
		txtpnUwagi.setBounds(10, 222, 230, 20);
		frame.getContentPane().add(txtpnUwagi);
		
		JTextPane txtpnWartociZ = new JTextPane();
		txtpnWartociZ.setText("Warto\u015Bci\u0105 z\u0142");
		txtpnWartociZ.setBounds(10, 279, 65, 20);
		frame.getContentPane().add(txtpnWartociZ);
		
		JTextPane txtpnSownie = new JTextPane();
		txtpnSownie.setText("s\u0142ownie:");
		txtpnSownie.setBounds(10, 299, 65, 20);
		frame.getContentPane().add(txtpnSownie);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 317, 230, 20);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(81, 279, 60, 1);
		frame.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(73, 279, 92, 20);
		frame.getContentPane().add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(356, 320, 86, 20);
		frame.getContentPane().add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(440, 320, 86, 20);
		frame.getContentPane().add(textPane_4);
		
		JTextPane txtpncznaWartoProtokou = new JTextPane();
		txtpncznaWartoProtokou.setText("\u0141\u0105czna warto\u015B\u0107 protoko\u0142u");
		txtpncznaWartoProtokou.setBounds(356, 340, 170, 20);
		frame.getContentPane().add(txtpncznaWartoProtokou);
		
		JTextPane txtpnZmniejszenieSprzedayBrutto = new JTextPane();
		txtpnZmniejszenieSprzedayBrutto.setText("Zmniejszenie sprzeda\u017Cy brutto");
		txtpnZmniejszenieSprzedayBrutto.setBounds(10, 360, 181, 20);
		frame.getContentPane().add(txtpnZmniejszenieSprzedayBrutto);
		
		txtpnZmniejszenieSprzedayNetto = new JTextPane();
		txtpnZmniejszenieSprzedayNetto.setText("Zmniejszenie sprzeda\u017Cy netto");
		txtpnZmniejszenieSprzedayNetto.setBounds(10, 400, 181, 20);
		frame.getContentPane().add(txtpnZmniejszenieSprzedayNetto);
		
		txtpnZmniejszeniePodatkuPtu = new JTextPane();
		txtpnZmniejszeniePodatkuPtu.setText("Zmniejszenie podatku PTU");
		txtpnZmniejszeniePodatkuPtu.setBounds(10, 380, 181, 20);
		frame.getContentPane().add(txtpnZmniejszeniePodatkuPtu);
		
		textPane_5 = new JTextPane();
		textPane_5.setBounds(201, 360, 41, 20);
		frame.getContentPane().add(textPane_5);
		
		textPane_6 = new JTextPane();
		textPane_6.setBounds(201, 380, 41, 20);
		frame.getContentPane().add(textPane_6);
		
		textPane_7 = new JTextPane();
		textPane_7.setBounds(201, 400, 41, 20);
		frame.getContentPane().add(textPane_7);
		
		txtpnZaczonoParagon = new JTextPane();
		txtpnZaczonoParagon.setText("Za\u0142\u0105czono paragon nr");
		txtpnZaczonoParagon.setBounds(10, 431, 120, 20);
		frame.getContentPane().add(txtpnZaczonoParagon);
		
		txtpnKasaNr = new JTextPane();
		txtpnKasaNr.setText("Kasa nr");
		txtpnKasaNr.setBounds(10, 455, 52, 20);
		frame.getContentPane().add(txtpnKasaNr);
		
		textField_79 = new JTextField();
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
	}
}
