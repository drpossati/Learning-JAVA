package cap07;

import java.util.Iterator;

public class OperationStrings {
	
	/*
	 * Formatar: toLowerCase(), toUpperCase(), trim()
	 * Recortar: substring(inicio), substring(inicio,fim)
	 * Substituir: replace(char, char), replace(string, string)
	 * Buscar: indexOf, lastIndexOf 
	 * Recortar em um character específico: str.Split("")
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "abcde * * * FGHIJ ABC espaços  abc DEFG Mais espaços  **     ";

		System.err.println("Original: " + original);
		System.out.println("\ntoLowerCase(): " + original.toLowerCase());
		System.out.println("\ntoUpperCase(): " + original.toUpperCase());
		System.out.println("\ntrim(): " + original.trim());
		System.out.println("\nsubstring(12): " + original.substring(12));
		System.out.println("\nsubstring(4, 18): " + original.substring(4, 18));
		System.out.println("\nreplace('a', 'x'): " + original.replace('a', 'x'));
		System.out.println("\nreplace('abc', 'xyz'): " + original.replace("abc", "xyz"));
		System.out.println("\nindexOf('abc'): " + original.indexOf("abc"));
		System.out.println("\nlastIndexOf('ABC'): " + original.lastIndexOf("ABC"));
		
		System.err.println("\n\nOperação split");
		
		String s = "potato, apple, lemon, big-box, small-city, good-town, black color, white color";
		
		String[] comma = s.split(",");
		String[] space = s.split(" ");
		String[] trace = s.split("-");
		
		System.out.println(s);
		
		System.out.println("\nSeparado por ',':");
		
		for (int ct = 0; ct < comma.length; ct++ )
			System.out.println(comma[ct]);
		
		System.out.println("\nSeparado por ' ':");
		
		for (int ct = 0; ct < space.length; ct++ )
			System.out.println(space[ct]);
		
		System.out.println("\nSeparado por '-':");
		
		for (int ct = 0; ct < trace.length; ct++ )
			System.out.println(trace[ct]);
		
	}

}
