package lab2_decrypting;

import java.util.Scanner;

public class Decrypt {
	String a;
	int b,c,d;
	
	public void decryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the ciphertext (without space): ");
		a = reader.nextLine();
		b = a.length();
		c = b/5;
		d = b%5;
		for (int i = 0; i < c; i = i + 1) {
			System.out.print(a.charAt(i*5 + 3));
			System.out.print(a.charAt(i*5 + 4));
			System.out.print(a.charAt(i*5 + 2));
			System.out.print(a.charAt(i*5));
			System.out.print(a.charAt(i*5 + 1));
		}
	}
}
