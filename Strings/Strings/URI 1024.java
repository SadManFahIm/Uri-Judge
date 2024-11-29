package Strings;


import java.util.Scanner;

public class URI 1024 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			StringBuilder M = new StringBuilder(readLine(leitor));
			
			
			for (int j = 0; j < M.length(); j++) {
				int code = M.charAt(j);
				if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
					char c = (char) (code + 3);
					M.setCharAt(j, c);
				}
			}
			
			M.reverse();
			
		
			for (int j = M.length() / 2; j < M.length(); j++) {
				char c = (char) (M.charAt(j) - 1);
				M.setCharAt(j, c);
			}
			
			
			System.out.println(M.toString());
		}
	}
	
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}

}
