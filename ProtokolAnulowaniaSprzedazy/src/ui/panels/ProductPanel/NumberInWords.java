package ui.panels.ProductPanel;

import java.math.BigDecimal;

public class NumberInWords {
	private int n;
	public static final String[] units = { "", "jeden", "dwa", "trzy", "cztery", "pi��", "sze��", "siedem", "osiem",
			"dziewi��", "dziesi��", "jedena�cie", "dwana�ce", "trzyna�cie", "czterna�cie", "pi�tna�cie", "szesna�cie",
			"siedemna�cie", "osiemna�cie", "dziewi�tna�cie" };

	public static final String[] tens = { "", "", "dwadzie�cia", "trzydzie�ci", "czterdzie�ci", "pi��dziesi�t",
			"sze��dziesi�t", "siedemdziesi�t", "osiemdziesi�t", "dziewi��dziesi�t" };

	public static final String[] hundreds = { "", "sto", "dwie�cie ", "trzysta ", "czterysta ", "pi��set ", "sze��set ",
			"siedemset ", "osiemset ", "dziewi��set ", };

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
			return " tysi�c";
		} else if ((n / 1000) < 5) {
			return " tysi�ce";
		} else {
			return " tysi�cy";
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