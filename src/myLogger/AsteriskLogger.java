package myLogger;


public class AsteriskLogger implements Logger{

	@Override
	public void log(String string) {
		// add three asterisk before and after 
		System.out.println(repeatStr("*", 3) + string + repeatStr("*", 3));
	}

	@Override
	public void error(String string) {
//		create a new variable for the error concat
		String errorString = "ERROR: \" + newString";
//      print an * the number of times 
		System.out.println(repeatStr("*", errorString.length()+6)); 
		System.out.println(repeatStr("*", 3) + errorString + repeatStr("*", 3));
		System.out.println(repeatStr("*", errorString.length()+6));
	}
//	return a string repeated given number time
	static String repeatStr(String str, int n) {
		String newStr = "";
		for (int i = 0; i < n; i++) {
			newStr += str;
		}
		return newStr;
	}

}
