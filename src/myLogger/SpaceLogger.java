package myLogger;

public class SpaceLogger implements Logger{

	@Override
	public void log(String string) {
		System.out.println("***" + spaceStr(string) + "***");
		
	}

	@Override
	public void error(String string) {
		// create a new string
		spaceStr(string);
		System.out.println("***ERROR: " + spaceStr(string) + "***");
	}
	
	public String spaceStr(String string) {
		String newString = "";
//		loop and add each letter with apace to the new string
		for (int i = 0; i < string.length(); i++) {
			if (i == string.length() -1) {
				newString += string.charAt(i);
			} else
				newString += string.charAt(i) + " ";
			}
		return newString;
	}

}
