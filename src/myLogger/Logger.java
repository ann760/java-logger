package myLogger;

public interface Logger {
	
	public void log(String string);
	public void error(String string);
	
	
//	return a string repeated given number time
	public static String repeatStr(String str, int n) {
		String newStr = "";
		for (int i = 0; i < n; i++) {
			newStr += str;
		}
		return newStr;
	}
}
