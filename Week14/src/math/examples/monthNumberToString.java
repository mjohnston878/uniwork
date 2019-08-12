package math.examples;

public class monthNumberToString {
	
	
	public static String numberToMonth(int month) {
		String monthStr = "";
		switch (month){
		case 1: 
			monthStr = "Jan";
			break;
		case 2:
			monthStr = "Feb";
			break;
		case 3: 
			monthStr = "Mar";
			break;
		default: 
			throw new NumberFormatException();
		} 
		return monthStr;
}
}
