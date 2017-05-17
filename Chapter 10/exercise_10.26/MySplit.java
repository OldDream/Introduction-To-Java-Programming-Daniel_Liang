import java.util.ArrayList;

public class MySplit {
	public static String[] split(String s, String regex) {
		if (isRegex(regex))
			return regexSplit(s, regex);
		else
			return wordSplit(s, regex);
	}

	public static String[] wordSplit(String s, String regex) {
		ArrayList<String> temp = new ArrayList<>();
		int index_start = 0;
		for (int i = 0; i < s.length() - regex.length(); i++) {
			if (s.substring(i, i + regex.length()).compareTo(regex) == 0) {
				temp.add(s.substring(index_start, i));
				temp.add(regex);
				index_start = i + regex.length();
			}
		}
		temp.add(s.substring(index_start, s.length()));
		return temp.toArray(new String[temp.size()]);
	}

	public static String[] regexSplit(String s, String regex) {
		ArrayList<String> temp = new ArrayList<>();
		int index_start = 0;
		
		for (int i = 0; i < s.length(); i++) {
			for(int j = 1; j < regex.length() - 1; j++) {
				if (s.charAt(i) == regex.charAt(j)) {
					temp.add(s.substring(index_start, i));
					temp.add(regex.charAt(j) + "");
					index_start = i + 1;
				}
			}
		}
		if (index_start < s.length())
			temp.add(s.substring(index_start, s.length()));
		return temp.toArray(new String[temp.size()]);
	}

	public static boolean isRegex(String regex) {
		if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']')
			return true;
		else
			return false;
	}
}