package com.ibercode;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println(" />");
		String word = scanner.nextLine();
		
		System.out.println(" />");
		int shift = Integer.valueOf(scanner.next());
		
		Caesar caesar = new Caesar(shift);
		
		String encrypted = caesar.encrypt(word);
		System.out.println("ENCRYPTED " + encrypted);
		
		String decrypted = caesar.dencrypt(encrypted);
		System.out.println("DECRIPTED " + decrypted);
		
		scanner.close();
	}
}
