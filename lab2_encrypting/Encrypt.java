package lab2_encrypting;

import java.util.Scanner;

public class Encrypt {
	String a;
	int b,c,d;
	
	public void Encryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a sentence (without space): ");
		a = reader.nextLine();
		b = a.length();
		c = b/5;
		d = b%5;
		String e = " ";
		if (d == 1) {
			a = a + e + e + e + e;
		}
		else if (d == 2) {
			a = a + e + e + e;
		}
		else if (d == 3) {
			a = a + e + e;
		}
		else if (d == 4) {
			a = a + e;
		}
		b = a.length();
		c = b/5;
		for (int i = 0; i < c; i = i + 1) {
			System.out.print(a.charAt(i*5 + 3));
			System.out.print(a.charAt(i*5 + 4));
			System.out.print(a.charAt(i*5 + 2));
			System.out.print(a.charAt(i*5));
			System.out.print(a.charAt(i*5 + 1));
		
		}
	}
}
