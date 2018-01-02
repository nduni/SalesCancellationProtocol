package ui.panels.ProductPanel;

import java.math.BigDecimal;

public class NumberInWords {
	private int n;
	public static final String[] units = { "", "jeden", "dwa", "trzy", "cztery", "piêæ", "szeœæ", "siedem", "osiem",
			"dziewiêæ", "dziesiêæ", "jedenaœcie", "dwanaœce", "trzynaœcie", "czternaœcie", "piêtnaœcie", "szesnaœcie",
			"siedemnaœcie", "osiemnaœcie", "dziewiêtnaœcie" };

	public static final String[] tens = { "", "", "dwadzieœcia", "trzydzieœci", "czterdzieœci", "piêædziesi¹t",
			"szeœædziesi¹t", "siedemdziesi¹t", "osiemdziesi¹t", "dziewiêædziesi¹t" };

	public static final String[] hundreds = { "", "sto", "dwieœcie ", "trzysta ", "czterysta ", "piêæset ", "szeœæset ",
			"siedemset ", "osiemset ", "dziewiêæset ", };

	public static String convertInteger(final int n) {
		if (n < 0) {
			return "Minus " + convertInteger(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return hundreds[n / 100] + ((n % 100 != 0) ? " " : "") + convertInteger(n % 100);
		}
		if (n < 10000) {
			return convertInteger(n / 1000) + thousandChecking(n) + ((n % 10000 != 0) ? " " : "") + convertInteger(n % 1000);
		}
		return "";
	}

	//
	public static String thousandChecking(final int n) {
		if ((n / 1000) == 1) {
			return " tysi¹c";
		} else if ((n / 1000) < 5) {
			return " tysi¹ce";
		} else {
			return " tysiêcy";
		}
	}

	public static String convert(BigDecimal value) {
		BigDecimal val = value;
		BigDecimal i= new BigDecimal(val.intValue());
		val = val.subtract(i);
		String s = val.toString();
		if (s.length()==3) {
			s = s+"0";
		s = s.substring(s.length()-2,s.length());
		}
		else if (s.length()>=4){
		s=	s.substring(s.length()-2,s.length());
		}
		else if (s.length()<3) {
			s = "00";
		}
		return convertInteger(i.intValue()) +" "+s+"/100";
	}

}